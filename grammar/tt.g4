grammar tt;

script
    : (statement)*;

instructions
    : (LEFT_CURLY_BRACKET statement+ RIGHT_CURLY_BRACKET) | statement;

condition
    : LEFT_ROUND_BRACKET alternative RIGHT_ROUND_BRACKET;

alternative
    : conjunction ( OR conjunction )*;

conjunction
    : comparison ( AND comparison )*;

comparison
    : (VARIABLE_NAME | INTEGER | return_statement | mathExpression )
        COMPARISON (VARIABLE_NAME | INTEGER | return_statement | mathExpression );

mathExpression
    : LEFT_ROUND_BRACKET (VARIABLE_NAME | INTEGER | return_statement | mathExpression)
    (PLUS | MINUS | MULTIPLY | DIVIDE) (VARIABLE_NAME | INTEGER | return_statement | mathExpression) RIGHT_ROUND_BRACKET;

statement
    : if_statement
    | while_statement
    | for_loop
    | declaration_statement SEMICOLON
    | assignement_statement SEMICOLON
    | timetable_statements SEMICOLON
    | print_statement SEMICOLON
    | SEMICOLON;

if_statement
    : IF condition instructions (ELSE instructions)?;

while_statement
    : WHILE condition instructions;

for_loop
    : FOREACH LEFT_ROUND_BRACKET timetable_type VARIABLE_NAME COLON VARIABLE_NAME DOT list_tt_statement RIGHT_ROUND_BRACKET instructions;

declaration_statement
    : type_declaration
    | string_declaration
    | int_declaration
    | timetable_declaration
    | timetable_data_declaration;

assignement_statement
    : type_assignment
    | string_assignment
    | int_assignment
    | timetable_assignment
    | timetable_data_assignment;

timetable_statements
    : gen_timetable
    | print_tt_statistics
    | generate_PDF
    | print_tt_data_statistics;

print_statement
    : PRINT LEFT_ROUND_BRACKET print_types (PLUS print_types)*  RIGHT_ROUND_BRACKET;

print_tt_statistics
    : VARIABLE_NAME DOT PRINT_TT_STATS LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

print_tt_data_statistics
    : VARIABLE_NAME DOT PRINT_TT_DATA_STATS LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

generate_PDF
    : VARIABLE_NAME DOT GEN_PDF LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

list_tt_statement
    :  LIST_TIMETABLE LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

open_timetable_data
    : OPEN_TT_DATA LEFT_ROUND_BRACKET STRING RIGHT_ROUND_BRACKET;

gen_timetable
    : VARIABLE_NAME DOT GEN_TIMETABLE LEFT_ROUND_BRACKET (INTEGER | INTEGER COMMA INTEGER) (COMMA INTEGER)? RIGHT_ROUND_BRACKET;

return_statement
    : get_fitness | get_classroom_count;

get_fitness
    : VARIABLE_NAME DOT GET_FITNESS LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

get_classroom_count
    : VARIABLE_NAME DOT GET_CLASSROOMS LEFT_ROUND_BRACKET RIGHT_ROUND_BRACKET;

//declarations
type_declaration
    : type VARIABLE_NAME (ASSIGNMENT VARIABLE_NAME)?;

string_declaration
    : string_type VARIABLE_NAME ASSIGNMENT STRING;

int_declaration
    : int_type VARIABLE_NAME ASSIGNMENT (mathExpression | return_statement | INTEGER);

timetable_data_declaration
    : timetable_data_type VARIABLE_NAME ASSIGNMENT open_timetable_data;

timetable_declaration
    : timetable_type VARIABLE_NAME ASSIGNMENT gen_timetable;
//declarations end

//assignments
type_assignment
    : VARIABLE_NAME ASSIGNMENT VARIABLE_NAME;

string_assignment
    : VARIABLE_NAME ASSIGNMENT STRING;

int_assignment
    : VARIABLE_NAME ASSIGNMENT (mathExpression | return_statement | INTEGER);

timetable_data_assignment
    : VARIABLE_NAME ASSIGNMENT open_timetable_data;

timetable_assignment
    : VARIABLE_NAME ASSIGNMENT gen_timetable;
//assignments end

print_types
    : VARIABLE_NAME | return_statement | STRING;

type
    : timetable_type | string_type | int_type | timetable_data_type;

timetable_type
    : TIMETABLE_TYPE;

timetable_data_type
    : TIMETABLE_DATA_TYPE;

int_type
    : INTEGER_TYPE;

string_type
    : STRING_TYPE;

INTEGER_TYPE: 'Integer';
STRING_TYPE: 'String';
TIMETABLE_TYPE: 'Timetable';
TIMETABLE_DATA_TYPE: 'TimetableData';
LEFT_ROUND_BRACKET: '(';
RIGHT_ROUND_BRACKET: ')';
LEFT_CURLY_BRACKET: '{';
RIGHT_CURLY_BRACKET: '}';
DOT: '.';

PRINT: 'print';
LIST_TIMETABLE: 'listAll';
OPEN_TT_DATA: 'openTTData';
GEN_TIMETABLE: 'genTimetable';
PRINT_TT_STATS: 'printStats';
PRINT_TT_DATA_STATS: 'printDataStats';
GEN_PDF: 'genPDF';
GET_FITNESS: 'getFitness';
GET_CLASSROOMS: 'getClassroomCount';

SEMICOLON: ';';
IF: 'if';
ELSE: 'else';
FOREACH: 'forEach';
WHILE: 'while';
COLON: ':';
ASSIGNMENT: '=';
OR: 'or';
AND: 'and';
COMPARISON: '==' | '!=' | '<' | '>' | '<=' | '>=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
VARIABLE_NAME: [a-zA-Z]([a-zA-Z0-9])*;
INTEGER: ('0'|[1-9][0-9]*);
STRING: '"'(~('"') | ('\\' ('"')))*'"';
COMMA: ',';
COMMENT : '#' ~[\n\r]* -> skip;
WHITESPACE : (' ' | [\n\t\r]) -> skip ;



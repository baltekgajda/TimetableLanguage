package main.lexerParser.gen;// Generated from C:/Users/bartl/git/TT/grammar\tt.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ttParser}.
 */
public interface ttListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ttParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ttParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ttParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(ttParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(ttParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ttParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ttParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ttParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ttParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ttParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ttParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ttParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ttParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(ttParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(ttParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ttParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ttParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ttParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ttParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ttParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ttParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ttParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ttParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(ttParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(ttParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#assignement_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignement_statement(ttParser.Assignement_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#assignement_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignement_statement(ttParser.Assignement_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_statements}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_statements(ttParser.Timetable_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_statements}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_statements(ttParser.Timetable_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(ttParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(ttParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#print_tt_statistics}.
	 * @param ctx the parse tree
	 */
	void enterPrint_tt_statistics(ttParser.Print_tt_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#print_tt_statistics}.
	 * @param ctx the parse tree
	 */
	void exitPrint_tt_statistics(ttParser.Print_tt_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#print_tt_data_statistics}.
	 * @param ctx the parse tree
	 */
	void enterPrint_tt_data_statistics(ttParser.Print_tt_data_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#print_tt_data_statistics}.
	 * @param ctx the parse tree
	 */
	void exitPrint_tt_data_statistics(ttParser.Print_tt_data_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#generate_PDF}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_PDF(ttParser.Generate_PDFContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#generate_PDF}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_PDF(ttParser.Generate_PDFContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#list_tt_statement}.
	 * @param ctx the parse tree
	 */
	void enterList_tt_statement(ttParser.List_tt_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#list_tt_statement}.
	 * @param ctx the parse tree
	 */
	void exitList_tt_statement(ttParser.List_tt_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#open_timetable_data}.
	 * @param ctx the parse tree
	 */
	void enterOpen_timetable_data(ttParser.Open_timetable_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#open_timetable_data}.
	 * @param ctx the parse tree
	 */
	void exitOpen_timetable_data(ttParser.Open_timetable_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#gen_timetable}.
	 * @param ctx the parse tree
	 */
	void enterGen_timetable(ttParser.Gen_timetableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#gen_timetable}.
	 * @param ctx the parse tree
	 */
	void exitGen_timetable(ttParser.Gen_timetableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(ttParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(ttParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#get_fitness}.
	 * @param ctx the parse tree
	 */
	void enterGet_fitness(ttParser.Get_fitnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#get_fitness}.
	 * @param ctx the parse tree
	 */
	void exitGet_fitness(ttParser.Get_fitnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#get_classroom_count}.
	 * @param ctx the parse tree
	 */
	void enterGet_classroom_count(ttParser.Get_classroom_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#get_classroom_count}.
	 * @param ctx the parse tree
	 */
	void exitGet_classroom_count(ttParser.Get_classroom_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(ttParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(ttParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(ttParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(ttParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(ttParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(ttParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_data_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_data_declaration(ttParser.Timetable_data_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_data_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_data_declaration(ttParser.Timetable_data_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_declaration(ttParser.Timetable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_declaration(ttParser.Timetable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#type_assignment}.
	 * @param ctx the parse tree
	 */
	void enterType_assignment(ttParser.Type_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#type_assignment}.
	 * @param ctx the parse tree
	 */
	void exitType_assignment(ttParser.Type_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(ttParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(ttParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(ttParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(ttParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_data_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_data_assignment(ttParser.Timetable_data_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_data_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_data_assignment(ttParser.Timetable_data_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_assignment(ttParser.Timetable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_assignment(ttParser.Timetable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#print_types}.
	 * @param ctx the parse tree
	 */
	void enterPrint_types(ttParser.Print_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#print_types}.
	 * @param ctx the parse tree
	 */
	void exitPrint_types(ttParser.Print_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ttParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ttParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_type}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_type(ttParser.Timetable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_type}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_type(ttParser.Timetable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#timetable_data_type}.
	 * @param ctx the parse tree
	 */
	void enterTimetable_data_type(ttParser.Timetable_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#timetable_data_type}.
	 * @param ctx the parse tree
	 */
	void exitTimetable_data_type(ttParser.Timetable_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#int_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_type(ttParser.Int_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#int_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_type(ttParser.Int_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ttParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(ttParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ttParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(ttParser.String_typeContext ctx);
}
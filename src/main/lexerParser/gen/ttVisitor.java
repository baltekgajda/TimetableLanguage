package main.lexerParser.gen;// Generated from C:/Users/bartl/git/TT/grammar\tt.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ttParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ttVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ttParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(ttParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(ttParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ttParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(ttParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(ttParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ttParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(ttParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ttParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ttParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(ttParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(ttParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(ttParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#assignement_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignement_statement(ttParser.Assignement_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_statements(ttParser.Timetable_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(ttParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#print_tt_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_tt_statistics(ttParser.Print_tt_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#print_tt_data_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_tt_data_statistics(ttParser.Print_tt_data_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#generate_PDF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_PDF(ttParser.Generate_PDFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#list_tt_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_tt_statement(ttParser.List_tt_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#open_timetable_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_timetable_data(ttParser.Open_timetable_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#gen_timetable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_timetable(ttParser.Gen_timetableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(ttParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#get_fitness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_fitness(ttParser.Get_fitnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#get_classroom_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_classroom_count(ttParser.Get_classroom_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(ttParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#string_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_declaration(ttParser.String_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#int_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_declaration(ttParser.Int_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_data_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_data_declaration(ttParser.Timetable_data_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_declaration(ttParser.Timetable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#type_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assignment(ttParser.Type_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#string_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_assignment(ttParser.String_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#int_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_assignment(ttParser.Int_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_data_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_data_assignment(ttParser.Timetable_data_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_assignment(ttParser.Timetable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#print_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_types(ttParser.Print_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ttParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_type(ttParser.Timetable_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#timetable_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimetable_data_type(ttParser.Timetable_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#int_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(ttParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ttParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(ttParser.String_typeContext ctx);
}
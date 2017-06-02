// Generated from Analizer\MyProject\compile.g4 by ANTLR 4.5.1
package Analizer.MyProject;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(compileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#analizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalizer(compileParser.AnalizerContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(compileParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(compileParser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(compileParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#vardec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec(compileParser.VardecContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#varasig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarasig(compileParser.VarasigContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(compileParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#logicexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicexpr(compileParser.LogicexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#comprex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComprex(compileParser.ComprexContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#comparop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparop(compileParser.ComparopContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(compileParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#numeric_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_result(compileParser.Numeric_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#logical_ent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_ent(compileParser.Logical_entContext ctx);
	/**
	 * Visit a parse tree produced by {@link compileParser#numeric_ent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_ent(compileParser.Numeric_entContext ctx);
}
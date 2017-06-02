// Generated from compile.g4 by ANTLR 4.4
package Analizer.MyProject;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compileParser}.
 */
public interface compileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compileParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicexpr(@NotNull compileParser.LogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicexpr(@NotNull compileParser.LogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#comparop}.
	 * @param ctx the parse tree
	 */
	void enterComparop(@NotNull compileParser.ComparopContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#comparop}.
	 * @param ctx the parse tree
	 */
	void exitComparop(@NotNull compileParser.ComparopContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(@NotNull compileParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(@NotNull compileParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull compileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull compileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#numeric_result}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_result(@NotNull compileParser.Numeric_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#numeric_result}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_result(@NotNull compileParser.Numeric_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#varasig}.
	 * @param ctx the parse tree
	 */
	void enterVarasig(@NotNull compileParser.VarasigContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#varasig}.
	 * @param ctx the parse tree
	 */
	void exitVarasig(@NotNull compileParser.VarasigContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#logical_ent}.
	 * @param ctx the parse tree
	 */
	void enterLogical_ent(@NotNull compileParser.Logical_entContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#logical_ent}.
	 * @param ctx the parse tree
	 */
	void exitLogical_ent(@NotNull compileParser.Logical_entContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#comprex}.
	 * @param ctx the parse tree
	 */
	void enterComprex(@NotNull compileParser.ComprexContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#comprex}.
	 * @param ctx the parse tree
	 */
	void exitComprex(@NotNull compileParser.ComprexContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull compileParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull compileParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull compileParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull compileParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(@NotNull compileParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(@NotNull compileParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull compileParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull compileParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#numeric_ent}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_ent(@NotNull compileParser.Numeric_entContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#numeric_ent}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_ent(@NotNull compileParser.Numeric_entContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(@NotNull compileParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(@NotNull compileParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compileParser#analizer}.
	 * @param ctx the parse tree
	 */
	void enterAnalizer(@NotNull compileParser.AnalizerContext ctx);
	/**
	 * Exit a parse tree produced by {@link compileParser#analizer}.
	 * @param ctx the parse tree
	 */
	void exitAnalizer(@NotNull compileParser.AnalizerContext ctx);
}
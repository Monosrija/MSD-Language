// Generated from MSDGrammar.g4 by ANTLR 4.4

  package edu.asu.msd;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSDGrammarParser}.
 */
public interface MSDGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#program_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_body(@NotNull MSDGrammarParser.Program_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#program_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_body(@NotNull MSDGrammarParser.Program_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull MSDGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull MSDGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MSDGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MSDGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull MSDGrammarParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull MSDGrammarParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void enterMath_operator(@NotNull MSDGrammarParser.Math_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#math_operator}.
	 * @param ctx the parse tree
	 */
	void exitMath_operator(@NotNull MSDGrammarParser.Math_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MSDGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MSDGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(@NotNull MSDGrammarParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(@NotNull MSDGrammarParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull MSDGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull MSDGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull MSDGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull MSDGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull MSDGrammarParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull MSDGrammarParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull MSDGrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull MSDGrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MSDGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MSDGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull MSDGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull MSDGrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull MSDGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull MSDGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(@NotNull MSDGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(@NotNull MSDGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull MSDGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull MSDGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(@NotNull MSDGrammarParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(@NotNull MSDGrammarParser.IfElseContext ctx);
}
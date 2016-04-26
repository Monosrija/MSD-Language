// Generated from MSDGrammar.g4 by ANTLR 4.4

  //package edu.asu.msse.msd;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSDGrammarParser}.
 */
public interface MSDGrammarListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MSDGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull MSDGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull MSDGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull MSDGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull MSDGrammarParser.CompoundStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MSDGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(@NotNull MSDGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(@NotNull MSDGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MSDGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MSDGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull MSDGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull MSDGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MSDGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MSDGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull MSDGrammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull MSDGrammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull MSDGrammarParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull MSDGrammarParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(@NotNull MSDGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(@NotNull MSDGrammarParser.DeclarationStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MSDGrammarParser#sequenceOfStatements}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOfStatements(@NotNull MSDGrammarParser.SequenceOfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#sequenceOfStatements}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOfStatements(@NotNull MSDGrammarParser.SequenceOfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(@NotNull MSDGrammarParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(@NotNull MSDGrammarParser.SimpleStatementContext ctx);
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
	 * Enter a parse tree produced by {@link MSDGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull MSDGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull MSDGrammarParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by {@link MSDGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull MSDGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull MSDGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull MSDGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull MSDGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSDGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull MSDGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSDGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull MSDGrammarParser.ParametersContext ctx);
}
// Generated from Expr2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr2Parser}.
 */
public interface Expr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Expr2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Expr2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Expr2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Expr2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Expr2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Expr2Parser.ExprContext ctx);
}
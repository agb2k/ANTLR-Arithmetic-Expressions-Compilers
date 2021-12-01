// Generated from Expr1.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr1Parser}.
 */
public interface Expr1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Expr1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Expr1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Expr1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Expr1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Expr1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Expr1Parser.ExprContext ctx);
}
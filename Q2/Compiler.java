import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Compiler {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        Expr2Lexer lexer = new Expr2Lexer(input);
        Expr2Parser parser = new Expr2Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog(); // begin parsing at rule ’r’
        System.out.println(tree.toStringTree(parser)); // print parse tree
    }
}
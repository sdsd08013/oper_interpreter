import java.util.*;
import non_terminal_expression.*;
import terminal_expression.*;
import abstract_expression.*;
import context.*;
 
class Client {
    public static void main(String[] args) {
        String source = "- 9 + 5 + 5 -";
        Context context = new Context(source);
        AbstractExpression expression = new NonTerminalExpression();
        System.out.println( expression.interpret(context) );
    }
}

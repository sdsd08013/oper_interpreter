package non_terminal_expression;

import java.util.List;
import java.util.ArrayList;
import abstract_expression.*;
import terminal_expression.*;
import context.*;

public class NonTerminalExpression extends AbstractExpression{
    private int resultValue;
    private String Plus = "+";
    private List<AbstractExpression> list = new ArrayList<AbstractExpression>();

    public int interpret(Context context){
        AbstractExpression childExpressions;
        context.nextToken();
        String token = "";
        while(!context.isEnd()){
            token = context.getToken();
            if(Plus.equals(token)){
                childExpressions = new NonTerminalExpression();
            }else{
                childExpressions = new TerminalExpression();
            }
            resultValue += childExpressions.interpret(context);
        }
        return resultValue;
    }

    public String toString(){
        return "+" + list.toString();
    }
}


package terminal_expression;
import abstract_expression.*;
import context.*;

public class TerminalExpression extends AbstractExpression{
    private String saveToken;
    
    public int interpret(Context context){
        String token = context.getToken();
        saveToken = token;
        context.nextToken();
        return Integer.parseInt(token);
    }

    public String toString(){
	return saveToken;
    }
}


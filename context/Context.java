package context;
import java.util.StringTokenizer;

public class Context{
    private StringTokenizer tokens;
    private String currentToken;
    public Context(String source){
      tokens = new StringTokenizer(source);
      nextToken();
    }

    public String getToken(){
      return currentToken;
    }

    public void nextToken(){
        String token = null;
        if( !isEnd() ){
            token = tokens.nextToken();
        }
        currentToken = token;
    }

    public boolean isEnd(){
      return !tokens.hasMoreElements();
    }
}

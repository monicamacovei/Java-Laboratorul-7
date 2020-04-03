import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Token> tokens = new ArrayList();

    public Board(int n, Token... tokens) {
        for(Token token : tokens) {
            this.tokens.add(token);
        }
    }

    public void removeToken() {
        int random = (int)((Math.random()*tokens.size()));
        tokens.remove(random);
    }
}

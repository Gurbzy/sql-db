package model.tokens;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Tokenizer {
    private ArrayList<Token> m_tokens = new ArrayList<>();
    private int m_size = 0;

    public Tokenizer(String query) {
	   String delim = "|";
	   String normal = query.replaceAll("\\s+", delim);
	   System.out.println(normal);
    }

    private static final Map<String, TokenInfo> m_info = new HashMap<>();

    static {
	   m_info.put("SELECT", new TokenInfo(TokenType.TOKEN_SELECT, Precedence.NONE));
	   m_info.put("WHERE", new TokenInfo(TokenType.TOKEN_WHERE, Precedence.NONE));
	   m_info.put("+", new TokenInfo(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_ADD));
    }
};

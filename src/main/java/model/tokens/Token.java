package model.tokens;

public class Token {
    private TokenType  type;
    private Precedence prec;
    private String     content;

    public Token(TokenType t, Precedence p, String s) {
	   this.type = t;
	   this.prec = p;
	   this.content = s;    
    }
}

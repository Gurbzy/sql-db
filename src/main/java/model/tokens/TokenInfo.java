package model.tokens;

public class TokenInfo {
    public TokenType t;
    public Precedence p;

    TokenInfo(TokenType tok, Precedence pre) {
	   this.t = tok;
	   this.p = pre;
    }
}

package model.tokens;

public class Token {
    private TokenType type;
    private Precedence prec;
    private String content;

    Token(TokenType t, Precedence p, String s) {
	   this.content = s;

	   String normalized = normalize(content);
    }

    private String normalize(String s) {
	   return s.toUpperCase();
    }

    private boolean isDigit(String s) {
	   if (s == null || s.isEmpty()) return false;
	   return s.chars().allMatch(Character::isDigit);
    }
}

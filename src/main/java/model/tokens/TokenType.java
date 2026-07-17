package model.tokens;

public enum TokenType {
    TOKEN_INVALID,
    TOKEN_INDENTIFIER,

    TOKEN_SELECT,
    TOKEN_FROM,
    TOKEN_WHERE,
    TOKEN_CREATE,
    TOKEN_TABLE,

    TOKEN_OPERATOR,
    TOKEN_LPAREN,
    TOKEN_RPAREN,
    TOKEN_COMMA,
    TOKEN_DOT,
    TOKEN_STRING,
    TOKEN_SEMICOLON;

    public boolean isKEYWORD() {
	   return (this == TOKEN_SELECT || this == TOKEN_FROM || this == TOKEN_WHERE || this == TOKEN_CREATE || this == TOKEN_TABLE);
    }
};

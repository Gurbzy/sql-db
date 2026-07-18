package service;

import model.tokens.Precedence;
import model.tokens.Token;
import model.tokens.TokenType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/*
    I want these following statements (in token list format) to be parsed into the appropriate AST:

    SELECT STATEMENTS:
    SELECT * FROM foo;
    SELECT name, job FROM foo;
    SELECT * FROM foo WHERE name = 'tyler';
    SELECT name, job FROM foo WHERE name = 'tyler' and job = 'software engineer';
    SELECT * FROM foo WHERE job IS NULL
    SELECT * FROM foo WHERE job IS NOT NULL
    SELECT * FROM foo WHERE job IS NULL and NAME = 'tyler'
 */
public class ParserServiceImplTest {

    @Nested
    @DisplayName("SELECT Statement tests")
    public class SelectStatementTests{
        @DisplayName("Basic SELECT * Statement")
        @Test
        void testBasicSelect() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_ASTERISK, Precedence.NONE, "*"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));


        }

        @DisplayName("Basic SELECT * Statement with WHERE clause")
        @Test
        void testSelectAllWhereClause() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_ASTERISK, Precedence.NONE, "*"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_WHERE, Precedence.NONE, "WHERE"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_STRING, Precedence.NONE, "tyler"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));


        }

        @DisplayName("SELECT with specific columns")
        @Test
        void testSelectWithColumns() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "name"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_COMMA, Precedence.NONE, ","));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));

        }

        @DisplayName("SELECT with specific columns and WHERE clause with AND")
        @Test
        void testSelectWithColumnsAndWhere() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "name"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_COMMA, Precedence.NONE, ","));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_WHERE, Precedence.NONE, "WHERE"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "name"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_EQ, "="));
            tokenizedStatement.add(new Token(TokenType.TOKEN_STRING, Precedence.NONE, "tyler"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_LAND, "and"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_EQ, "="));
            tokenizedStatement.add(new Token(TokenType.TOKEN_STRING, Precedence.NONE, "software engineer"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));

        }

        @DisplayName("SELECT with WHERE IS NULL")
        @Test
        void testSelectWhereIsNull() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_ASTERISK, Precedence.NONE, "*"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_WHERE, Precedence.NONE, "WHERE"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IS, Precedence.NONE, "IS"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_NULL, Precedence.NONE, "NULL"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));

        }

        @DisplayName("SELECT with WHERE IS NOT NULL")
        @Test
        void testSelectWhereIsNotNull() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_ASTERISK, Precedence.NONE, "*"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_WHERE, Precedence.NONE, "WHERE"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IS, Precedence.NONE, "IS"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_NOT, Precedence.NONE, "NOT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_NULL, Precedence.NONE, "NULL"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));

        }

        @DisplayName("SELECT with WHERE IS NULL and column equals value")
        @Test
        void testSelectWhereIsNullAndEquals() {
            List<Token> tokenizedStatement = new LinkedList<Token>();
            tokenizedStatement.add(new Token(TokenType.TOKEN_SELECT, Precedence.NONE, "SELECT"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_ASTERISK, Precedence.NONE, "*"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_FROM, Precedence.NONE, "FROM"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "foo"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_WHERE, Precedence.NONE, "WHERE"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "job"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IS, Precedence.NONE, "IS"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_NULL, Precedence.NONE, "NULL"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_LAND, "and"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_IDENTIFIER, Precedence.NONE, "NAME"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_OPERATOR, Precedence.OPERATOR_EQ, "="));
            tokenizedStatement.add(new Token(TokenType.TOKEN_STRING, Precedence.NONE, "tyler"));
            tokenizedStatement.add(new Token(TokenType.TOKEN_SEMICOLON, Precedence.NONE, ";"));

        }
    }

    @Nested
    @DisplayName("CREATE tests")
    public class CreateTests {

    }

    @Nested
    @DisplayName("Insert tests")
    public class InsertTests {

    }
}

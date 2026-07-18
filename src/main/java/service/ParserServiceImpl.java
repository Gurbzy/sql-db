package service;

import model.ast.AbstractSyntaxTree;
import model.ast.Expr;
import model.tokens.Token;

import java.util.List;

public class ParserServiceImpl implements ParserService{
    @Override
    public AbstractSyntaxTree buildTree(List<Token> tokensList) {
        return null;
    }

    private Expr parseExpr(List<Token> tokensList) {
        return new Expr();
    }

}

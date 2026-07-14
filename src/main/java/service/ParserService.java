package service;

import model.ast.AbstractSyntaxTree;
import model.tokens.Token;

import java.util.List;

public interface ParserService {
    public AbstractSyntaxTree buildTree(List<Token> tokensList);
}

package service;

import model.tokens.Token;

import java.util.List;

public interface TokenizerService {
    List<Token> tokenize(StringBuffer input);
    List<Token> tokenize(String input);
}
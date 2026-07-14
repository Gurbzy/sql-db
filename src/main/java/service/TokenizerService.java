package service;

import model.tokens.Token;

import java.util.List;

interface TokenizerService {
    List<Token> tokenize(StringBuffer input);
}
import lombok.extern.slf4j.Slf4j;
import model.ast.AbstractSyntaxTree;
import model.tokens.Token;
import model.tokens.Tokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.ParserService;
import service.ParserServiceImpl;
import service.TokenizerService;
import service.TokenizerServiceImpl;

import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        TokenizerService tokenizerService = new TokenizerServiceImpl();
        ParserService parserService = new ParserServiceImpl();
	   Tokenizer tokenizer = new Tokenizer("SELECT CATS FROM FIELD = 15 WHERE YAY");
        logger.info("Hello SQL World!");
    }
}

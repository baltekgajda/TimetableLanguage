package test;

import main.exceptions.MultipleVariableDeclarationException;
import main.exceptions.TTException;
import main.exceptions.VariableUndeclaredException;
import main.lexerParser.TTVisitor;
import main.lexerParser.gen.ttLexer;
import main.lexerParser.gen.ttParser;
import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestTTVisitor {

    @Test
    public void shouldThrowNullPointeException() throws IOException {

        CharStream charStream = CharStreams.fromFileName("C:\\Users\\bartl\\git\\TT\\examples\\nullPointerExceptionExample.txt");
        ttLexer ttlexer = new ttLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(ttlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        ttParser ttparser = new ttParser(tokenStream);

        assertThrows(NullPointerException.class,
                ()->{
                    TTVisitor visitor = new TTVisitor();
                    visitor.visit(ttparser.script());
                });
    }

    @Test
    public void shouldThrowMultipleVariableDeclarationException() throws IOException {

        CharStream charStream = CharStreams.fromFileName("C:\\Users\\bartl\\git\\TT\\examples\\multipleVariableDeclarationExceptionExample.txt");
        ttLexer ttlexer = new ttLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(ttlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        ttParser ttparser = new ttParser(tokenStream);

        assertThrows(MultipleVariableDeclarationException.class,
                ()->{
                    TTVisitor visitor = new TTVisitor();
                    visitor.visit(ttparser.script());
                });
    }

    @Test
    public void shouldThrowTTException() throws IOException {

        CharStream charStream = CharStreams.fromFileName("C:\\Users\\bartl\\git\\TT\\examples\\tTExceptionExample.txt");
        ttLexer ttlexer = new ttLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(ttlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        ttParser ttparser = new ttParser(tokenStream);

        assertThrows(TTException.class,
                ()->{
                    TTVisitor visitor = new TTVisitor();
                    visitor.visit(ttparser.script());
                });
    }

    @Test
    public void shouldThrowVariableUndeclaredException() throws IOException {

        CharStream charStream = CharStreams.fromFileName("C:\\Users\\bartl\\git\\TT\\examples\\variableUndeclaredExceptionExample.txt");
        ttLexer ttlexer = new ttLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(ttlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        ttParser ttparser = new ttParser(tokenStream);

        assertThrows(VariableUndeclaredException.class,
                ()->{
                    TTVisitor visitor = new TTVisitor();
                    visitor.visit(ttparser.script());
                });
    }

}

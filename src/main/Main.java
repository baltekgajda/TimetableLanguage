package main;

import main.lexerParser.TTVisitor;
import main.lexerParser.gen.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String [] args) throws IOException
    {
        CharStream charStream = CharStreams.fromFileName("C:\\Users\\bartl\\git\\TT\\examples\\example4.txt");
        ttLexer ttlexer = new ttLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(ttlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        ttParser ttparser = new ttParser(tokenStream);

/*        JFrame frame = new JFrame("Timetable Tree");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(ttparser.getRuleNames()),ttparser.script());
        viewr.setScale(2.5);
        panel.add(viewr);
        frame.add(new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(4000,1500);
        frame.setVisible(true);*/

        TTVisitor visitor = new TTVisitor();
        visitor.visit(ttparser.script());
    }
}

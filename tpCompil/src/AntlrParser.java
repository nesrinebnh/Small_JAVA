import org.antlr.v4.gui.TestRig;
import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;

import javax.print.PrintException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;

public class AntlrParser extends TestRig {
    public static Quad quad;
    public static Routines routines = new Routines();

    public AntlrParser(String[] args) throws Exception {
        super(args);
    }

    /** parameters are "name of grammar the root of the grammar input text for texting the compiler
     * in this example
     * gram prog ./src/example.cc -tree -gui
     * -gui to generate the graph
     * -tree generate tree as a text
     */
    public static void main(String[] args) throws Exception{
        AntlrParser m = new AntlrParser(args);
        if(args.length >= 2) {
            m.process();
        }
    }

    public static void addListeners(Parser parser)
    {
        routines = new Routines();
        quad = new Quad(routines);
        parser.addParseListener(quad);
        parser.addParseListener(routines);
    }
    protected void process(Lexer lexer, Class<? extends Parser> parserClass,Parser parser, CharStream input) throws IOException, IllegalAccessException, InvocationTargetException, PrintException {
        /** input contains our example*/
        lexer.setInputStream(input);
        addListeners(parser);
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

            }
        });
        lexer.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

            }
        });


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        if(this.showTokens) {
            Iterator i$ = tokens.getTokens().iterator();

            while(i$.hasNext()) {
                Token tok = (Token)i$.next();
                if(tok instanceof CommonToken) {
                    System.out.println(((CommonToken)tok).toString(lexer));
                } else {
                    System.out.println(tok.toString());
                }
            }
        }
        if(!this.startRuleName.equals("tokens")) {
            if(this.diagnostics) {
                parser.addErrorListener(new DiagnosticErrorListener());
                ((ParserATNSimulator)parser.getInterpreter()).setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            }

            if(this.printTree || this.gui || this.psFile != null) {
                parser.setBuildParseTree(true);
            }

            if(this.SLL) {
                ((ParserATNSimulator)parser.getInterpreter()).setPredictionMode(PredictionMode.SLL);
            }
            parser.setTokenStream(tokens);
            parser.setTrace(this.trace);
            try {
                Method startRule = parserClass.getMethod(this.startRuleName, new Class[0]);
                ParserRuleContext tree = (ParserRuleContext)startRule.invoke(parser, (Object[])null);
                if(this.printTree) {
                    System.out.println(tree.toStringTree(parser));
                }

                if(this.gui) {
                    Trees.inspect(tree, parser);
                }

                if(this.psFile != null) {
                    Trees.save(tree, parser, this.psFile);
                }
            } catch (NoSuchMethodException var8) {
                System.err.println("No method for rule " + this.startRuleName + " or it has arguments");
            }

        }

    }
}

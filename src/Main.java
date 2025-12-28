//import grammars.LanguageLexer;
//import grammars.LanguageParser;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;  // ANTLR 4
//import org.antlr.v4.runtime.tree.ParseTree;
//
//import java.io.IOException;
//
//import static org.antlr.v4.runtime.CharStreams.fromFileName;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        try {
//            String path ="samples/sample1.txt";
//            CharStream input = CharStreams.fromFileName(path);
//            LanguageLexer lexer = new LanguageLexer(input);
//            CommonTokenStream token = new CommonTokenStream(lexer);
//            LanguageParser parser = new LanguageParser(token);
//            ParseTree tree = parser.json();
//            ProgramVisitor visitor = new ProgramVisitor();
//            Program program = visitor.visit(tree);
//            System.out.println(program);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        }
//}

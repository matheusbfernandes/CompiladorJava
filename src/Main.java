import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        String fileName = "C:\\Users\\Matheus\\Documents\\Teste.java";
        Java scanner = new Java(CharStreams.fromFileName(fileName));
        CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);
        allTokensGenerated.fill();
        List<Token> l = allTokensGenerated.getTokens();
        System.out.println("+====================================+");
        System.out.format("|%-14s |%-5s |%-5s |%-6s|\n","LEXEMA", "TIPO", "LINHA", "COLUNA");
        System.out.println("|---------------|------|------|------|");
        for (Token t : l) {
            System.out.format("|%-14s |%-5d |%-5d |%-6d|\n", t.getText(), t.getType(), t.getLine(), t.getStartIndex());
        }
        System.out.println("+====================================+");
    }
}

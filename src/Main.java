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
        for (Token t : l) {
            System.out.println("Texto: " + t.getText() + ", Linha: " + t.getLine() + ", Tipo: " + t.getType());
        }
    }
}

import afd.AFD;
import analisadorLexico.Java;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import tabela.TabelaSimbolos;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        String fileName = "C:/Users/Matheus/Documents/Teste.java";

        Java scanner = new Java(CharStreams.fromFileName(fileName));
        CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);
        allTokensGenerated.fill();

        List<Token> listaTokens = allTokensGenerated.getTokens();

        TabelaSimbolos tabelaSimbolos = new TabelaSimbolos(listaTokens);

        System.out.println("+========================================+");
        System.out.format("|%-16s |%-6s |%-6s |%-6s|%n","LEXEMA", "TIPO", "LINHA", "COLUNA");
        System.out.println("|-----------------|-------|-------|------|");
        for (Token t : listaTokens) {
            if (t.getType() == 107) {
                System.out.format("|Token '%s' nao reconhecido na linha: %d:%d|%n", t.getText(), t.getLine(), t.getCharPositionInLine());
            }
            else {
                System.out.format("|%-16s |%-6d |%-6d |%-6d|%n", t.getText(), t.getType(), t.getLine(), t.getCharPositionInLine());
            }
        }
        System.out.println("+========================================+");
        System.out.println();

        System.out.print(tabelaSimbolos.getConteudo());

        AFD afd = new AFD(listaTokens, "pdf");
    }
}

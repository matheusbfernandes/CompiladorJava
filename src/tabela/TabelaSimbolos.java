package tabela;

import org.antlr.v4.runtime.Token;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class TabelaSimbolos {
    private HashMap<String, String> tabelaSimbolos;

    public TabelaSimbolos(List<Token> listaTokens) {
        tabelaSimbolos = new HashMap<>();

        for (Token t : listaTokens) {
            if (t.getType() == 51) {
                tabelaSimbolos.putIfAbsent(t.getText(), t.getText());
            }
        }
    }

    public String getConteudo() {
        Collection<String> c = tabelaSimbolos.values();

        StringBuilder lexemas = new StringBuilder("+==================+\n|Tabela de Simbolos|\n|------------------|\n");
        for (String s : c) {
            lexemas.append(String.format("|%-18s|%n", s));
        }
        lexemas.append("+==================+\n");

        return lexemas.toString();
    }
}

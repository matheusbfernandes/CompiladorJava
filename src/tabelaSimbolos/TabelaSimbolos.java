package tabelaSimbolos;

import java.util.Collection;
import java.util.LinkedHashMap;

public class TabelaSimbolos {
    private static TabelaSimbolos instancia = null;
    private LinkedHashMap<String, Simbolo> tabelaSimbolos;

    public static TabelaSimbolos getInstancia() {
        if (instancia == null) {
            instancia = new TabelaSimbolos();
        }
        return instancia;
    }

    private TabelaSimbolos() {
        tabelaSimbolos = new LinkedHashMap<>();
    }

    public void addSimbolo(Simbolo simbolo) {
        tabelaSimbolos.putIfAbsent(simbolo.getSimboloNome(), simbolo);
    }

    @Override
    public String toString() {
        Collection<Simbolo> valores = tabelaSimbolos.values();

        StringBuilder lexemas = new StringBuilder("+=======Tabela de Simbolos=======+\n|     Simbolo     |     Tipo     |\n|--------------------------------|\n");
        for (Simbolo s : valores) {
            lexemas.append(String.format("|%-17s|%-14s|%n", s.getSimboloNome(), s.getNomeTipo()));
        }
        lexemas.append("+================================+\n");

        return lexemas.toString();
    }
}
package afd;

public class Transicao {
    private char transicao;
    private Vertice destino;
    public Transicao(char tran, Vertice dest) {
        transicao = tran;
        destino = dest;
    }

    public char getTransicao() {
        return transicao;
    }

    public Vertice getDestino() {
        return destino;
    }
}

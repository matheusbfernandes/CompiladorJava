package afd;

import sun.net.www.content.image.gif;

import java.util.ArrayList;

public class Vertice {
    private ArrayList<Transicao> al;
    private int numC;

    public Vertice(int numC){
        al = new ArrayList<Transicao>();
        this.numC = numC;
    }
    public void addTransicao(char tran, Vertice dest){
        Transicao aux = new Transicao(tran, dest);
        al.add(aux);
    }

    public int getNumC() {
        return numC;
    }

    public ArrayList<Transicao> getAl() {
        return al;
    }
}

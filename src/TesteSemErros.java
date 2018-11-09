package test;
import org.antlr.v4.runtime;

public class TesteSemErros extends java implements java {
    private int num;
    
    protected TesteSemErros(int num, double num2, Strings[] numeros) {
        super(num, num2, numeros);
        super.metodo();
    }
    
    public TesteSemErros(int x, int y, int z) {
        this(x, y, z);
    }
    
    public int metodo() {
        return 1;
    }
    
    public static void main(String[] args) throws IOException {
        TesteSemErros tse = TesteSemErros(1, 2, 3);
        Exemplo exemplo = (Exemplo)TesteSemErros;
        
        int[][][] vetor = new Exemplo[10][2][];
        int[][] v = new int[10][];
        
        int[] vetor2 = {1, 2, 3};
        int result = vetor2[0] + vetor2[0] * vetor2[0];
        result++++;
        
        float num = 12e2f;
        super.metodo().num = num;
        
        metodo().metodo2(1, 2);
        if (0 == 0) num = 0.f;
        
        if(1 == 1) {
        
        }
        
        if (2 == 3) {
        
        }
        else {
            
        }
        
        try {
        
        }
        catch (IOException ioe) {
            System.out.println("test");
        }
        finally {
        
        }
        
        switch (x) {
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        
        b = (a > 0) ? 1 : 2;
        
        for(int i = 0; i < 10; ++i) {
            
        }
        
        if (1!=1) for(int i = 0; i < 10; ++i) continue;
        else {
            break;
        }
        
        byte x = (byte) 16;
        x = x >> 2;
        
        new Exemplo();
        vetor2[a + b] = x;
        
        metodo().x();
    }
}

public interface Exemplo extends java {
    public void m1();
    public int m2();
}
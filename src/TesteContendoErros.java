// import vazio
import ;

public class TesteContendoErros {
    // keyword public foi digitada de forma errada
    publicc void metodo(String nome) {
        System.out.println(nome);
    }

    public static void main(String[] args){
        // array não foi inicializado
        int[] vetor = new int[];
        
        // na seguinte operação o parenteses não foi fechado
        int result = (3 + 4 * 100;
        
        // falta ponto e virgula na seguinte declaração
        float numReal = 10.f
        
        int num = 3;
        // erro ao tentar verificar a igualdade da variável num com 0
        num == 0;
        
        if (num == 3) {
            System.out.println(num);
        
        // chave no if foi aberta, mas não fechada
        
        int x = 10, y = 4, z = 1;
        // não é possível realizar uma atribuição da seguinte forma
        x * y = z;
        
        // falta um operador entre x e y
        z = x y;
        
        // falta aspas duplas para fechar a string
        String s = "exemplo;
    }
}
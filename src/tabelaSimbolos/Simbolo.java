package tabelaSimbolos;

public class Simbolo {
    private String nome;
    private int tipo;

    public Simbolo(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getSimboloNome() {
        return nome;
    }

    public int getSimboloTipo() {
        return tipo;
    }

    public String getNomeTipo() {
        String nomeDoTipo;
        switch (tipo) {
            case 87:
                nomeDoTipo = "DecimalNumeral";
                break;
            case 88:
                nomeDoTipo = "OctalNumeral";
                break;
            case 89:
                nomeDoTipo = "HexNumeral";
                break;
//            case 90:
//                nomeDoTipo = "FloatNumeral";
//                break;
            case 90:
                nomeDoTipo = "DoubleNumeral";
                break;
            case 91:
                nomeDoTipo = "Character";
                break;
            case 92:
                nomeDoTipo = "String";
                break;
            case 51:
                nomeDoTipo = "ID";
                break;
            default:
                nomeDoTipo = "Tipo Invalido";
                break;
        }
        return nomeDoTipo;
    }
}

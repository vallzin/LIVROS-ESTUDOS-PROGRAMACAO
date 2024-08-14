//imprimindo linha de texto com multiplas opções


public class BemVindo {
    //método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        System.out.println("Bem-vindo\n a\n programação\n com\n Java!");
        System.out.println();
        System.out.println("\\n Nova linha. Posiciona o cursor de tela no início da próxima linha.\n" +
                " \\t Tabulação horizontal. Move o cursor de tela para a próxima parada de tabulação.\n" +
                " \\r Retorno de carro. Posiciona o cursor da tela no início da linha atual — não avança para a \n" +
                "próxima linha. Qualquer saída de caracteres depois do retorno de carro sobrescreve a saída de \n" +
                "caracteres anteriormente gerada na linha atual.\n" +
                " \\ Barras invertidas. Utilizadas para imprimir um caractere de barra invertida.\n" +
                " \\\" Aspas duplas. Utilizadas para imprimir um caractere de aspas duplas. Por exemplo,\n" +
                "   System.out.println(\"\\\"entre aspas\\\"\");\n" +
                " exibe \"entre aspas\".");

    }//fim método main
}//fim da Classe Bemvindo

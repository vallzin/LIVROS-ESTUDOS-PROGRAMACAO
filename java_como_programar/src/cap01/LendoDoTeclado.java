package cap01;

import java.util.Scanner;//imports devem aparecer antes da primeira declaração da classe no arquivo

public class LendoDoTeclado {
    //import java.util.Scanner; Inserir uma declaração import
    //dentro de uma declaração de classe é um erro de sintaxe.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Boa prática
        int num1;//Declare cada variável em uma declaração própria.
        int num2;
        int soma;

        System.out.print("Digite o primeiro número:");
        num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.printf("O resultado da soma entre %d e %d é %d", num1, num2, soma);
    }
    //import java.util.Scanner; Inserir uma declaração import
    //depois de uma declaração de classe é um erro de sintaxe.
}

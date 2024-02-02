package com.monitoriafundamentosjava;
import java.util.Scanner;

public class MonitoriaFundamentosJavaApplication
{
    public static void main(String[] args) {

        int num1 = 13;
        float num2 = 1.3f;
        double num3 = 1.3;
        char letra = 'c';
        String texto = "Mandacaru";
        boolean b = true;

        int[] arr = {1, 2, 3, 4};

        System.out.print("Hello World!" + " " + num1 + " " + num2 + " " + num3 + " " + letra + " " + texto + " " + b + " " + arr[2]);

        //VERIFICADOR DE NUMEROS PRIMOS:
        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.print("Digite um valor inteiro positivo: ");
            while(!input.hasNextInt()) {
            System.out.println("Por favor digite um valor valido!");
            System.out.print("Por favor digite um inteiro positivo: ");
            input.next();
        }

        num = input.nextInt();
    }while(num <= 0);

        if(num < 2)
        {
            System.out.print("Numeros menores que 2 nao sao primos");
        }
        else {
            boolean ehPrimo = true;
            for(int i = 2; i < Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    ehPrimo = false;
                    break;
                }
                else {
                    ehPrimo = true;
                }
            }

            if(ehPrimo)
            {
                System.out.print("O numero " + num + " eh primo");
            }
            else {
                System.out.print("O numero " + num + " nao eh primo");
            }
        }

        Livro livro1 = new Livro("O Quinze", "Raquel de Queiroz");
        livro1.exibirDetalhes();

        LivroFiccaoCientifica livroFCC = new LivroFiccaoCientifica("Cyberpunk", "William Gibson", "Romance");
        livroFCC.exibirDetalhes();
    }
}



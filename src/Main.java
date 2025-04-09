
import java.util.Scanner;
import Entities.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alternativa;
        double resultado;

        do {
            System.out.println("--- CALCULADORA ACESSADA ---");
            
            System.out.println("Informe o primeiro número: ");
            double num1;
            num1 = sc.nextDouble();
            System.out.println("Informe o segundo número: ");
            double num2;
            num2 = sc.nextDouble();


            System.out.println("--- OPERAÇÃO ---");
            System.out.println("[1] PARA SOMA");
            System.out.println("[2] PARA SUBTRAÇÃO");
            System.out.println("[3] PARA DIVISÃO");
            System.out.println("[4] PARA MULTIPLICAÇÃO");
            System.out.println("[0] PARA FECHAR O PROGRAMA");

            alternativa = sc.nextInt();

             resultado = 0;

            switch (alternativa) {
                case 0:
                    System.out.println("Programa finalizado");
                    break;

                case 1:
                    resultado = Calculator.somaCalculator(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;

                case 2:
                    resultado = Calculator.subCalculator(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;

                case 3:
                    resultado = Calculator.divCalculator(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;

                case 4:
                    resultado = Calculator.multCalculator(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while(alternativa!=0);

        sc.close();
        }
}
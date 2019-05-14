import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Questao1();
        Questao2();
        Questao3();
        Questao4();
        Questao5();
        Questao6();
        Questao7();
        Questao8();
        Questao9();
        Questao10();

        scanner.close();
    }

    private static void Questao1(){
        System.out.println("Questão 1:");
        System.out.print("Insira um número para que todos os termos entre 1 e ele sejam somados: ");
        System.out.println("Resultado da soma: " + Exercicio1.soma_ate_n(scanner.nextInt()));
        System.out.println();
    }

    private static void Questao2(){
        System.out.println("Questão 2:");
        System.out.print("Insira um número de horas, minutos e segundos (no formato H:M:S) para ser convertido em segundos: ");
        System.out.println("Resultado da soma (H + M + S) em segundos: " + Exercicio2.converte_segundos(scanner.nextLine()));
        System.out.println();
    }

    private static void Questao3(){
        System.out.println("Questão 3:");
        System.out.println("Insira a primeira string a ser comparada: ");
        String comparavel1 = scanner.next();
        System.out.println("Insira a segunda string a ser comparada: ");
        String comparavel2 = scanner.next();
        System.out.println("Resultado da comparação: " + Exercicio3.compara_strings(comparavel1, comparavel2));
        System.out.println();
    }

    private static void Questao4(){
        System.out.println("Questão 4:");
        System.out.println("Insira um valor para o raio de uma esfera para que seu volume seja calculado: ");
        System.out.println("Volume da esfera: " + Exercicio4.calcVolEsfera(scanner.nextDouble()));
        System.out.println();
    }

    private static void Questao5(){
        System.out.println("Questão 5:");
        System.out.println("Insira um número para que seja verificado se ele é positivo ou negativo: ");
        System.out.println(Exercicio5.ehPositivo(scanner.nextInt()) ? "é positivo" : "é negativo");
        System.out.println();
    }

    private static void Questao6(){
        System.out.println("Questão 6:");
        System.out.println("Informe o sexo da pessoa (f/m): ");
        char sexo = scanner.next().charAt(0);
        System.out.println("Informe a altura da pessoa: ");
        double altura = scanner.nextDouble();
        double pesoIdeal = Exercicio6.calcPesoIdeal(altura, sexo);
        if (pesoIdeal == 0){
            System.out.println("Nenhum sexo válido foi inserido, impossível realizar o cálculo.");
        } else {
            System.out.println("O peso ideal desta pessoa é: " + pesoIdeal);
        }
        System.out.println();
    }

    private static void Questao7(){
        System.out.println("Questão 7:");
        System.out.println("Insira " + (new Random().nextInt(10) + 1) + " números separados por espaço para que a média aritmética deles seja calculada: ");
        System.out.println("A média aritmética dos números inseridos é: " + Exercicio7.calcMediaArit(scanner.nextLine()));
        System.out.println();
    }

    private static void Questao8(){
        System.out.println("Questão 8:");
        System.out.println("Insira 5 números separados por espaço para que sejam determinados o maior e o menor: ");
        Exercicio8.maiorEmenor(scanner.nextLine());
        System.out.println();
    }

    private static void Questao9(){
        System.out.println("Questão 9:");
        System.out.println("Insira um número n para que o resultado da forma S = (1 + 1/1! + 1/2! + 1/3! + ... + 1/n!) seja calculado: ");
        System.out.println("S = " + Exercicio9.calcSomaFatInverso(scanner.nextInt()));
        System.out.println();
    }

    private static void Questao10(){
        System.out.println("Questão 10:");
        System.out.println("Insira o primeiro termo da operação: ");
        double a = scanner.nextDouble();
        System.out.println("Insira o sinal da operação (+, -, /, *): ");
        char sinal = scanner.next().charAt(0);
        System.out.println("Insira o segundo termo da operação: ");
        double b = scanner.nextDouble();
        double resultado = Exercicio10.fazCalculo(a, sinal, b);
        System.out.print("Resultado da operação: ");
        System.out.print((resultado == 0 && sinal == '/') ? "inválido." : resultado);
        System.out.println();
    }
}

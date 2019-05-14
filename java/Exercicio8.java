import java.util.Scanner;

public class Exercicio8 {

    public static void maiorEmenor(String input) {
        String[] vetInput = input.split(" ");
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < vetInput.length; i++) {
            if (Integer.parseInt(vetInput[i]) > maior) {
                maior = Integer.parseInt(vetInput[i]);
            }
            if (Integer.parseInt(vetInput[i]) < menor) {
                menor = Integer.parseInt(vetInput[i]);
            }
        }
        System.out.println("O maior número dentre os inseridos é " + maior + " e o menor é " + menor);
    }

}

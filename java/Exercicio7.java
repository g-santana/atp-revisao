public class Exercicio7 {

    public static double calcMediaArit(String input){
        String[] vetorInput = input.split(" ");
        double soma = 0;
        for (int i = 0; i < vetorInput.length; i++){
            soma += Double.parseDouble(vetorInput[i]);
        }
        return (soma/(double) vetorInput.length);
    }

}

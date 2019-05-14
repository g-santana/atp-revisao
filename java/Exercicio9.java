public class Exercicio9 {

    public static double calcSomaFatInverso(int n){
        double fat = 1;
        double soma = 1;
        for (int i = 1; i <= n; i++){
            fat *= i;
            soma += 1/fat;
        }
        return soma;
    }

}

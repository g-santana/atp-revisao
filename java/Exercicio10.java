public class Exercicio10{

    public static double fazCalculo(double a, char sinal, double b){
        switch (sinal){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0){
                    System.out.println("Tentativa de divisão por zero - operação inválida.");
                    break;
                } else {
                    return a / b;
                }
            default:
                return 0;
        }
        return 0;
    }

}

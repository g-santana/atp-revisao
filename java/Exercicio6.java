public class Exercicio6 {

    public static double calcPesoIdeal(double alt, char sexo){
        switch (sexo){
            case 'f':
                return 62.1 * alt - 44.7;
            case 'm':
                return 72.7 * alt - 58;
            default:
                return 0;
        }
    }

}

public class Exercicio2 {

    public static int converte_segundos(String tempo){
        String[] vetorTempo = tempo.split(":");
        int[] hms = {Integer.parseInt(vetorTempo[0]), Integer.parseInt(vetorTempo[1]), Integer.parseInt(vetorTempo[2])};
        return (hms[0] * 60 * 60) + (hms[1] * 60) + hms[2];
    }

}

public class Exercicio3 {

    public static int compara_strings(String a, String b){
        char[] comparavelA = a.toCharArray();
        char[] comparavelB = b.toCharArray();
        for(int i = 0; i < comparavelA.length; i++){
            if(comparavelA[i] != comparavelB[i]){
                return i;
            }
        }
        return 0;
    }

}

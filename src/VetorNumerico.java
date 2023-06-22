public class VetorNumerico {
    public static void main(String[] args) {
        int[] vetorNumerico = new int[10];

        for (int i = 0 ; i < vetorNumerico.length ; i++)
        {
            vetorNumerico[i] = (int) (Math.random() * 100 - 0 + 1) + 0;
            System.out.printf("vetor númerico na posicao %d possui esse valor = %d: \n" , i, +vetorNumerico[i]);
        }

    }
}
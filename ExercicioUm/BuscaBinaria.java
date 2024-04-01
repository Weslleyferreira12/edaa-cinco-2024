public class BuscaBinaria {

    public BuscaBinaria() {
    }

    public int buscaBinaria(int[] array, int chave) {
        int esquerda = 0;
        int direita = array.length -1;

        while(esquerda <= direita) {
            int meio = (esquerda + direita) /2;
            if(array[meio] == chave) {
                return meio;
            }

            if(array[meio] < chave) {
                esquerda = meio +1;
            }

            if(array[meio] > chave) {
                direita = meio -1;
            }
        }
        return -1;
    }

}
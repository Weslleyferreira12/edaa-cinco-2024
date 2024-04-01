public class BuscaMuseu {

    public BuscaMuseu() {
    }
 
    public int busca(int[] array, int target) {
     int esquerda = 0;
     int direita = array.length -1;
 
 
      while(esquerda <= direita) {
          int meio = (esquerda + direita) /2;
             if (array[meio] == target ) {
              return meio;
             }
             if (array[meio] < target) {
              esquerda = meio +1;
             }
             if (array[meio] > target) {
              direita = meio - 1;
          }
      }
      return -1;
  }
 
      public void imprimir(int[] array, int um, int dois, int tres) {
         System.out.println("\nA galáxia de Andrômeda está no guarda volume " + array[um] + " posição: " + um);
         System.out.println("\nA galáxia do Olho Negro está no guarda volume " + array[dois] + " posição: " + dois);
         System.out.println("\nO Objeto de Hoag está no guarda volume " + array[tres] + " posição: " + tres);
 
      }
 
 }
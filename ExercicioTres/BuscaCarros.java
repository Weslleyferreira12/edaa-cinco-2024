import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class BuscaCarros{


    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");



    public BuscaCarros() {
    }


    public int buscaBinaria(int[] array, int target) {
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


    public void imprimir(int[] target, int indices[]) {
        
         String dataFormatada = formatterData.format(agora);
         String horaFormatada = formatterHora.format(agora);

        for (int i = 0; i< target.length; i++) {
            System.out.println("\n      Registro: " + dataFormatada + " - " + horaFormatada );
            System.out.println("\nCarro/Placa: " + target[i] + " , foi o " + indices[i] + "º carro que trafegou na via\n\n" );

        }
    }

}
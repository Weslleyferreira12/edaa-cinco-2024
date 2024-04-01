public class Programa {
    public static void main(String[] args) {

        BuscaBinaria busca = new BuscaBinaria();

        int[] array = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
             306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
             355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
             391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
             429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
             483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
             511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
             554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
             613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
             652, 654, 655, 662, 667, 671, 673, 674, 695, 696
             };

             int numA = 415, numB =  545, numC = 390, numD = 609, numE = 296;


            
            int resultadoA = busca.buscaBinaria(array, numA);
            if (resultadoA > -1) {
                System.out.println("\nO número " + numA + " está na posição: " + resultadoA );
            } else {
                System.out.println("\n O número " + numA + " não está presente neste array");
            }

            
            int resultadoB = busca.buscaBinaria(array, numB);
            if (resultadoB > -1) {
                System.out.println("\nO número " + numB + " está na posição: " + resultadoB );
            } else {
                System.out.println("\n O número " + numB + " não está presente neste array");
            }

            
            int resultadoC = busca.buscaBinaria(array, numC);
            if (resultadoC > -1) {
                System.out.println("\nO número " + numC + " está na posição: " + resultadoC );
            } else {
                System.out.println("\n O número " + numC + " não está presente neste array");
            }

            
            int resultadoD = busca.buscaBinaria(array, numD);
            if (resultadoD > -1) {
                System.out.println("\nO número " + numD + " está na posição: " + resultadoD );
            } else {
                System.out.println("\n O número " + numD + " não está presente neste array");
            }

            
            int resultadoE = busca.buscaBinaria(array, numE);
            if (resultadoE > -1) {
                System.out.println("\nO número " + numE + " está na posição: " + resultadoE );
            } else {
                System.out.println("\n O número " + numE + " não está presente neste array");
            }


    }
}
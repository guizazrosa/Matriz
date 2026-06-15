import java.util.Scanner;
public class Matriz2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o número dos espectadores da sala + " + (i + 1) + "da sessão" + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();

            }
        }

        System.out.println("\t\tS1\tS2\tS3\tS4\tS5");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Sala " + (i + 1) + "\t");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.println("TOTAL POR SALA\n");

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;

            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }

            System.out.println("Sala" + (i + 1) + " : " + soma + " espectadores ");

        }

        System.out.println("TOTAL POR SESSÃO\n");

        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }

            System.out.println("Sessão " + (j + 1) + " : " + soma + " espectadores ");

        }

        int soma2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma2 = soma2 + matriz[i][j];
            }
        }
        System.out.println("TOTAL GERAL DO CINEMA: " + soma2 + " espectadores ");


    }
}
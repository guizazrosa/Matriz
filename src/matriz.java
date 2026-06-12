import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tempocorredores = new int[10];

        for (int i = 0; i < tempocorredores.length; i++) {
            System.out.println("Digite os tempo do " + (i + 1) + " corredor em minutos: ");
            tempocorredores[i] = scanner.nextInt();
        }

        for (int i = 0; i < tempocorredores.length; i++) {
            System.out.println("Os respecivos tempos são - " + (i+1) + "-:" + tempocorredores[i]);
        }

        System.out.println();

        int soma = 0;

        for (int i = 0; i < tempocorredores.length; i++) {
            soma += tempocorredores[i];
        }

        double media = soma / tempocorredores.length;
        System.out.println("Média de tempo da prova: " + media);


        double melhor = 1000;

        for (double elemento : tempocorredores){
            if (elemento < melhor){
                melhor = elemento;

            }
        }

        System.out.println("melhor tempo da prova: " + melhor);

        double pior = 0;

        for (double elemento : tempocorredores){
            if (elemento > pior){
                pior = elemento;

            }
        }

        System.out.println("pior tempo da prova: " + pior);

        int corredoresabmedia = 0;

        for (double elemento : tempocorredores){
            if (elemento < media ){
                corredoresabmedia ++;

            }
        }
        System.out.println("corredores abaixo da média: " + corredoresabmedia);

    }
}
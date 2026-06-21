import java.util.Scanner;

public class ControleAgua {

    static Scanner scanner = new Scanner(System.in);
    static double[][] consumo = new double[3][4];

    public static void main(String[] args) {
        lerConsumo();
        mostrarTabela();

        double[] totaisSetor = totalPorSetor();
        double[] totaisSemana = totalPorSemana();
        double total = consumoTotal();

        for (int i = 0; i < totaisSetor.length; i++) {
            System.out.printf("Total Setor %d: %.2f%n", (i + 1), totaisSetor[i]);
        }

        System.out.println();

        for (int j = 0; j < totaisSemana.length; j++) {
            System.out.printf("Total Semana %d: %.2f%n", (j + 1), totaisSemana[j]);
        }

        System.out.println();
        System.out.printf("Consumo Total Geral: %.2f%n", total);
    }

    // Lê o consumo de cada setor em cada semana
    static void lerConsumo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Setor %d - Semana %d: ", (i + 1), (j + 1));
                consumo[i][j] = scanner.nextDouble();
            }
        }
        System.out.println();
    }

    // Exibe a tabela formatada com cabeçalho
    static void mostrarTabela() {
        System.out.printf("%-12s", " ");
        for (int j = 0; j < 4; j++) {
            System.out.printf("%-8s", "Sem" + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-12s", "Setor " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-8.1f", consumo[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Retorna um array com o total de consumo de cada setor
    static double[] totalPorSetor() {
        double[] totais = new double[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totais[i] += consumo[i][j];
            }
        }
        return totais;
    }

    // Retorna um array com o total de consumo de cada semana
    static double[] totalPorSemana() {
        double[] totais = new double[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                totais[j] += consumo[i][j];
            }
        }
        return totais;
    }

    // Retorna o consumo total geral (soma de todos os valores)
    static double consumoTotal() {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total += consumo[i][j];
            }
        }
        return total;
    }
}
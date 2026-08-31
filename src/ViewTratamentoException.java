import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewTratamentoException {

    public static void main (String[] args) {

        double notas[] = new double[3];// Vetor para armazenar
        double somaNotas = 0;// variavel para somar
        int posicao = 0;// Identificação

        Scanner leitor = new Scanner(System.in);//Abertura do recurso, que faz a leitura do teclado do usuário.

        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota da " + (i + 1) + " avaliação: ");
                notas[i] = leitor.nextDouble();
                somaNotas += notas[i];
            }

            while (posicao != -1) {
                System.out.println("Digite o número da avaliação para ver a nota, ou " +
                        "-1 para seguir o programa!");
                posicao = leitor.nextInt();// Outra possibilidade de exceção
                if (posicao != -1)
                    System.out.println("A nota da " + posicao + " avaliação é " + notas[posicao - 1]);
            }

            System.out.println("A média do aluno é " + somaNotas / notas.length);
            leitor.close();
        }
        catch (InputMismatchException erro) { //exceção para quando o usuário digita um número inválido
            System.out.println("foi digitado um valor inválido");
        }
        catch (ArrayIndexOutOfBoundsException erro) {// Exceção paraquando o usuário inserir o valor inválido do vetor
            System.out.println("O numero da avaliação não existe.");
        }
        finally {
            leitor.close();
        }

        System.out.println("Finalizando o programa!");

    }

}

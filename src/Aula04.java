
public class Aula04 {

    public static void main(String[] args) {
        // ex00();
        exMatriz();
    }

    public static void ex00(){

        System.out.println("EX 00:");

        
        int valor;
        do{
            System.out.print("Informe um valor entre 2 e 10: ");
            valor = Console.lerInt();
        }while(valor < 2 || valor > 10);
        
        int[] vetor = new int[valor];
        
        System.out.println("\nIniciando a leitura do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor para a posição " + i + ": ");
            vetor[i] = Console.lerInt();
        }

        System.out.println("\nVetor Gerado:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void exMatriz(){

        System.out.println("\nExemplo Matriz");

        int[][] m1 = new int[3][3];

        for (int lin = 0; lin < m1.length; lin++) {
            for (int col = 0; col < m1[lin].length; col++) {
                
                System.out.print("Informe o valor para a posição "+ lin + " - " + col + ": ");
                m1[lin][col] = Console.lerInt();

            }
        }

        System.out.println("\nEXIBINDO MATRIZ GERADA:");
        for (int lin = 0; lin < m1.length; lin++) {
            for (int col = 0; col < m1[lin].length; col++) {
                
                System.out.print(m1[lin][col] + "\t");

            }
            System.out.println();
        }
    }

    public static void exObjetoAluno(){

        Aluno aluno1 = new Aluno();
        

    }
}

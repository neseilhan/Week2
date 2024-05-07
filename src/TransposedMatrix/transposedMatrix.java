package TransposedMatrix;
import java.util.Arrays;
import java.util.Scanner;

public class transposedMatrix {
    public static int[][] findTranspose(int[][] matrix) { //bir matrisi tranpoza cevirme methodu.
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {  //satirlari sutunlara, sutunlari satirlara cevirmek icin dongu.
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen satir sayisi giriniz : ");
        int rows = inp.nextInt();

        System.out.println("Lutfen sutun sayisi giriniz : ");
        int columns = inp.nextInt();

        int[][] matrix = new int[rows][columns]; //kullanicidan satir satir elemanlari alma.
        System.out.println("Lutfen matrisin elemanlarini giriniz : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }

        System.out.print("Girilen matrix :"); //kullanicinin girdigi matrisi yazdirma.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = findTranspose(matrix); //findTranspose() methoduyla degistirilen matrisi yazdirma.
        System.out.println("Transposed Matrix :");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }




    }
}

import java.util.Scanner;
public class lab1Problem3 {

    /**
     * Метод flattenMatrix преобразует матрицу размера nxm в одномерный массив, записывая сперва элементы первого столбца,
     * затем элементы второго столбца и т.д.
     *
     * @param matrix матрица размера nxm
     * @return одномерный массив
     *
     * ПРИМЕР:
     * Вход: matrix = [[1, 2, 3],
     *                 [4, 5, 6],
     *                 [7, 8, 9]]
     * Выход: [1, 4, 7, 2, 5, 8, 3, 6, 9]
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xCount,yCount;
        System.out.println("Enter the number of rows:");
        xCount = input.nextInt();
        System.out.println("Enter the number of columns:");
        yCount = input.nextInt();
        int matrix[][] = new int[xCount][yCount];
        int number;
        int array[] = new int[xCount*yCount];

        for(int i = 0;i<xCount;i++) {
            for(int j=0;j<yCount;j++) {
                System.out.print("Enter the element in row " + (i+1) +" and in column " + (j+1) + ": ");
                number = input.nextInt();
                matrix[i][j] = number;
            }
        }
        flattenMatrix(matrix, array, xCount, yCount);

        System.out.print("[");
        for(int k=0;k<xCount*yCount;k++) {
            System.out.printf(" %d ", array[k]);
        }
        System.out.print("]");
        input.close();


    }  
    public static int[] flattenMatrix(int[][] matrix, int array[], int xCount, int yCount) {
        // TODO: implement this method
        int count = 0;
        for(int i=0;i<xCount;i++) {
            for(int j=0;j<yCount;j++) {
                array[count++] = matrix[j][i];
            }
        }

        return array;
    }

}
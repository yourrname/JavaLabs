import java.util.Scanner;

public class lab1Problem4 {

    public static void main(String[] args) {
        String numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        numbers = input.nextLine();

        System.out.println(isGeometricProgression(numbers));

        input.close();



    }

    /**
     * Метод isGeometricProgression определяет, является ли данная последовательность чисел numbers геометрической
     * прогрессией (возможно, при перестановке элементов)
     *
     * @param numbers строка, содержащая n положительных целых чисел, разделенных запятой
     * @return true, если последовательность является геометрической прогрессией
     *         false, если последовательность не является геометрической прогрессией
     *
     * ПРИМЕР1:
     * Вход: numbers = "1,2,4,8,16"
     * Выход: true
     *
     * ПРИМЕР2:
     * Вход: numbers = "16,2,8,1,4"
     * Выход: true (так как в результате перестановки элементов можно получить геометрическую прогрессию [1,2,4,8,16])
     *
     * ПРИМЕР3:
     * Вход: numbers = "2,3,5"
     * Выход: false
     */
    public static boolean isGeometricProgression(String numbers) {
        String [] numberArray = numbers.split(",");
        int n = numberArray.length;
        int[] Array = new int[n];

        for(int i=0;i<n;i++) {
            Array[i] = Integer.parseInt(numberArray[i]);
        }

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(Array[j]>Array[j+1]) {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }

            }
            }
        int ratio = Array[1]/Array[0];

        for(int i=1;i<n;i++) {
            if(Array[i] != Array[i-1]*ratio) {
                return false;
            }
        }
        return true;
        // TODO: implement this method
    }

}
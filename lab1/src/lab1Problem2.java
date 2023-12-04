import java.util.Scanner;
public class lab1Problem2 {

    /**
     * Метод segregateEvenAndOddNumbers разделяет четные и нечетные числа в массиве array, т.у. возвращает массив,
     * в котором сперва записаны все четные числа массива array в порядке их следования, а затем все нечетные числа
     * массива array в порядке их следования.
     *
     * @param array массив положительных чисел
     * @return массив с разделенными четными и нечетными числами
     *
     * ПРИМЕР:
     * Вход: array = [2, 1, 5, 6, 8]
     * Выход: [2, 6, 8, 1, 5]
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the array: ");
        int count = input.nextInt();
        int array[] = new int[count];
        int number;
        for(int i=0;i<count;i++) {
            System.out.println("Enter "+(i+1)+" value");
            number = input.nextInt();
            array[i] = number;
        }
        segregateEvenAndOddNumbers(array, count);
        System.out.print("[");
        for(int i=0;i<count;i++) {
            System.out.printf(" %d,", array[i]);
        }
        System.out.print("]");
        input.close();
    }

    public static int[] segregateEvenAndOddNumbers(int[] array, int count) {
        // TODO: implement this method
        int newArray[] = new int[count];
        int newCount = 0;

        for(int i=0;i<count;i++){
            if(array[i]%2==0) {
                newArray[newCount++] = array[i];
            }
        }
        
        for(int i=0;i<count;i++){
            if(array[i]%2!=0) {
                newArray[newCount++] = array[i];
            }
        }
        for(int i=0;i<count;i++){
            array[i] = newArray[i];
        }
        return array;
    }

}

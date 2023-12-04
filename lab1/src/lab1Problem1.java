
import java.util.Scanner;
public class lab1Problem1 {

    /**
     * Метод containsDigitAInHexadecimalRepresentation определяет, содержится ли символ A в шестнадцатиричном
     * представлении числа number.
     *
     * @param number целое положительное число
     * @return true, если шестнадцатиричная запись numbers содержит A
     *         false, если шестнадцатиричная запись numbers не содержит A
     *
     * ПРИМЕР1:
     * Вход: number = 10
     * Выход: true (10 = 0xA, содержит A)
     *
     * ПРИМЕР2:
     * Вход: number = 9
     * Выход: false (9 = 0x9, не содержит A)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number = input.nextInt();
        if (containsDigitAInHexadecimalRepresentation(number)) {
            System.out.println("True"); 
        }else
        {
           System.out.println("False"); 
        }
        input.close();


    }

    public static boolean containsDigitAInHexadecimalRepresentation(int number) {
        // TODO: implement this method
        while (number>0){
            if (number%16 == 10){
                return true;
            }
            else {
                number/=16;
            }

        }
        return false;
    }
}


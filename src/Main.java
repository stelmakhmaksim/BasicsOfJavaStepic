import java.util.*;
//Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

/*Решать можно разными способами:
воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value which you want to check: ");
        System.out.print(isPowerOfTwo(sc.nextInt()));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        //return Integer.bitCount(Math.abs(value)) == 1;
        value = Math.abs(value);
        return (value & -value) == value;
    }
}

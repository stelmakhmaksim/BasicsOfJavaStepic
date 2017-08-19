//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
//Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter value: ");
            int value = in.nextInt();
            System.out.print("Enter offset: ");
            int bitIndex = in.nextInt();
            System.out.print("Result: " + flipBit(value, bitIndex) + "\n");
            System.out.print("If you want to quit press 'q', else press any symbol to continue: ");
            String b = in.next();
            if (b == "q") break;
        } while (true);
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value    any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return (value ^ (1 << bitIndex - 1));
    }
}

import java.util.*;

//Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance after backslash symbol: ");
        System.out.print(charExpression(sc.nextInt()));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}

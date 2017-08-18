//Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//Допустимая погрешность – 0.0001 (1E-4)
public class Main {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        System.out.println(doubleExpression(a, b, c));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 1E-4;
    }
}

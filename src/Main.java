import java.util.Random;

//В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
//Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(leapYearCount(random.nextInt(2017)));
    }

    public static int leapYearCount(int year) {
        return year / 4 + year / 400 - year / 100;
    }
}

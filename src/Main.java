class Stack {
    private int[] stk;
    private int tos;


    Stack(int size) {
        stk = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stk.length - 1) System.out.println("Стек заполнен");
        else stk[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        } else return stk[tos--];
    }
}

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test o) {
        a /= 2;
        b *= 2;
    }

}

class Factorial {
    int result;

    int fact(int f) {
        if (f == 1)
            return 1;
        else result = fact(f - 1) * f;
        return result;
    }
}

class Ex {
    int a;

    Ex(int a) {
        this.a = a;
    }

    Ex() {
    }

    void ck() {
        System.out.println("Меня возьмут на курсы в епам 21 июля 2017");
    }
}

class Ex1 extends Ex {
    int b;

    Ex1(int b) {

        this.b = b;
    }

    void ck(int a) {

    }
}

public class Main {
    /*static void a(int... x) {
        for (int v : x) {
            System.out.println(v + " ");

        }
    }

    static int a = 3;*/

    public static void main(String[] args) {
        /*Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(10);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 10; i++) mystack2.push(i);

        System.out.println("содержимое первого стека");
        for (int i = 0; i < 5; i++) System.out.println(mystack1.pop());

        System.out.println("содержимое второго стека");
        for (int i = 0; i < 10; i++) System.out.println(mystack2.pop());*/
        //-----------------------------------------------------------------------------
        /*Test m = new Test(100, 200);
        Test m1= new Test(10,20);
        m.meth(m1);*/
//-----------------------------------------
        /*System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int b = Integer.parseInt(a);
        Factorial f = new Factorial();
        System.out.println(f.fact(b));*/
//------------------------------------
        /*RecTest rt = new RecTest(10);
        for (int i = 0; i < 10; i++)
            rt.arr[i] = i;
        rt.printArray(5);*/
        //---------------------------

/*Ex1 b = new Ex1(3);
b.ck();
    }*/
//----------------------

    }

    class RecTest {
        int arr[];

        RecTest(int i) {
            arr = new int[i];
        }

        void printArray(int i) {
            if (i == 0) return;
            else printArray(i - 1);
            System.out.println((i - 1) + "asda" + arr[i - 1]);
        }
    }
}

package Lesson11;

public class o {
    public static void main(String[] args) {
        int a =5;
        int b =3;


        int oldValue = a;
        a = b;
        b = oldValue;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}

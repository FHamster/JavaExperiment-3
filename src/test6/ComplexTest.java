package test6;

public class ComplexTest
{
    public static void main(String[] args)
    {
        Complex a = new Complex(2, 5);
        Complex b = new Complex(4, 3);

        System.out.println("初始化" + a);
        System.out.println("初始化" + b);

        System.out.println("add" + a.add(b));
        System.out.println("minus" + a.minus(b));
        System.out.println("multiple" + a.multiple(b));
        System.out.println("divide" + a.divide(b));

    }
}


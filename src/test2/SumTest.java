package test2;

public class SumTest
{
    public static void main(String[] argc)
    {
        Sum sum = new Sum();
        System.out.println(sum.getSum(1, 100));
        System.out.println("static:" + Sum.static_getSum(1, 100));
    }
}

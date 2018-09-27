package test5;

import java.util.Scanner;

public class QuadraticEquationTest
{
    public static void main(String[] args)
    {
        for (int i = 0;i<3;i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入二次方程的a，b，c" );
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            QuadraticEquation Q = new QuadraticEquation(a, b, c);

            if (Q.getDiscriminant() > 0)
            {
                System.out.println(Q.getRoot1());
                System.out.println(Q.getRoot2());

            } else if (Q.getDiscriminant() < 0)
            {
                System.out.println("The equation has no roots." );
            } else
            {
                System.out.println(Q.getRoot1());
            }
        }
    }
}


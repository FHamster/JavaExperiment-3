package test5;

class QuadraticEquation
{
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant()
    {
        return b * b - 4 * a * c;
    }

    public double getRoot1()
    {
        if (getDiscriminant() < 0)
        {
            return 0;
        } else
        {
            return (-b + Math.sqrt(getDiscriminant()) / (2 * a));
        }
    }

    public double getRoot2()
    {
        if (getDiscriminant() < 0)
        {
            return 0;
        } else
        {
            return (-b - Math.sqrt(getDiscriminant()) / (2 * a));
        }
    }
}

package test3;

class Rectangle extends Shape
{
    private double a;//a边
    private double b;//b边

    Rectangle(double a, double b)
    {
        System.out.printf("初始化Rectangle %f %f\n", a, b);
        this.a = a;
        this.b = b;
        countArea();
        countPerimeter();
    }

    @Override
    public void countPerimeter()
    {
        setPerimeter((a + b) * 2);
    }

    @Override
    public void countArea()
    {
        setArea(a * b);
    }
}

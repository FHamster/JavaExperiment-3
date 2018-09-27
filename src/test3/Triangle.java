package test3;

class Triangle extends Shape
{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c)
    {
        System.out.printf("初始化Triangle %f %f %f\n", a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        countArea();
        countPerimeter();
    }

    @Override
    public void countPerimeter()
    {
        setPerimeter(a + b + c);
    }

    @Override
    public void countArea()
    {
        double p = (a + b + c) / 2;
        setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

package test3;

class Circle extends Shape
{
    private double radius;

    Circle(double radius)
    {
        System.out.printf("初始化Circle radius = %f\n", radius);
        this.radius = radius;
        countArea();
        countPerimeter();
    }

    @Override
    public void countPerimeter()
    {
        setPerimeter(2 * Math.PI * radius);
    }

    @Override
    public void countArea()
    {
        setArea(Math.PI * radius * radius);
    }
}

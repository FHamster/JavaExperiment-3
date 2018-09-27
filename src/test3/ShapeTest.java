package test3;

public class ShapeTest
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Triangle triangle1 = new Triangle(1, 1, 1);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Rectangle rectangle1 = new Rectangle(1, 1);
        Rectangle rectangle2 = new Rectangle(3, 5);

        Shape[] shapes = new Shape[6];
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = triangle1;
        shapes[3] = triangle2;
        shapes[4] = rectangle1;
        shapes[5] = rectangle2;

        double sumArea = 0;
        double sumPer = 0;
        for (Shape x : shapes)
        {
            System.out.println("Area = " + x.getArea());
            sumArea += x.getArea();
            System.out.println("Per = " + x.getPerimeter());
            sumPer += x.getPerimeter();
        }

        System.out.println("sumArea = " + sumArea);
        System.out.println("sumPer = " + sumPer);

    }
}


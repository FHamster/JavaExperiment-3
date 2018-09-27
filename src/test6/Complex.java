package test6;

class Complex
{
    private int real;
    private int imaginary;

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }


    public int getReal()
    {
        return real;
    }

    public void setReal(int real)
    {
        this.real = real;
    }

    public int getImaginary()
    {
        return imaginary;
    }

    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }

    @Override
    public String toString()
    {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public Complex add(Complex c)
    {
        return new Complex(real + c.real,
                imaginary + c.imaginary);
    }

    public Complex minus(Complex c)
    {
        return new Complex(real - c.real,
                imaginary - c.imaginary);
    }

    public Complex multiple(Complex c)
    {
        int i = real * c.real - imaginary * c.imaginary;
        int j = c.real * imaginary + c.imaginary * real;
        return new Complex(i, j);
    }

    public Complex divide(Complex c)
    {
        int tmp = c.real * c.real + c.imaginary * c.imaginary;
        int i = (real * c.real + imaginary * c.imaginary) / tmp;
        int j = (imaginary * c.real - real * c.imaginary) / tmp;
        return new Complex(i, j);
    }
}

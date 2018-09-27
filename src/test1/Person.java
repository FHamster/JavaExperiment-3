package test1;

class Person
{
    private String Name;
    private int sex;
    private int age;

    @Override
    public String toString()
    {
        return String.format("Name = %s\nsex = %d\nage = %d\n", Name, sex, age);
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    Person()
    {
        this.Name = "";
        this.sex = 0;
        this.age = 0;
    }
}
package test4;

class PersonVer2
{
    private String Name;
    private int sex;
    private int age;
    private int id;
    private static int count = 0;

    @Override
    public String toString()
    {
        return String.format("Name = %s," +
                "sex = %d," +
                "age = %d," +
                "id = %d," +
                "count = %d,", Name, sex, age, id, count);
    }

    PersonVer2(String name, int age)
    {
        this.Name = name;
        this.age = age;
        this.sex = 1;

        this.id = count;
        count++;
    }

    PersonVer2(String name, int sex, int age)
    {
        Name = name;
        this.sex = sex;
        this.age = age;

        this.id = count;
        count++;
    }

}
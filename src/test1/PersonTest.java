package test1;

public class PersonTest
{
    public static void main(String[] argc)
    {
        Person person = new Person();
        System.out.println(person);

        System.out.println("after set");
        person.setName("xixi");
        person.setAge(12);
        person.setSex(0);
        System.out.println(person);
    }
}

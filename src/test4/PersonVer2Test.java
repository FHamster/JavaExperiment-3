package test4;

public class PersonVer2Test
{
    public static void main(String[] args)
    {
        PersonVer2 per1 = new PersonVer2("kao", 23);
        PersonVer2 per2 = new PersonVer2("kao", 1, 23);

        System.out.println(per1);
        System.out.println(per2);

        PersonVer2[] personVer2s = new PersonVer2[10];
        for (int i = 0; i < personVer2s.length; i++)
        {
            personVer2s[i] = new PersonVer2("Roger", 23);
        }

        for (PersonVer2 x : personVer2s)
        {
            System.out.println(x);
        }
    }
}

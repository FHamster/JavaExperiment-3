package test7;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student.writeStudentsToFile();
        Student[] students = Student.readStudentsFromFile();
        Student.sortAndOut(students);
        System.out.println("done");
    }
}

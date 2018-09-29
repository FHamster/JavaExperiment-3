package test7;

import java.util.Arrays;

public class StudentTest
{
    public static void main(String[] args)
    {
        Student.writeStudentsToFile();
        Student[] students = Student.readStudentsFromFile();
//        Student.sortAndOut(students);
        Arrays.sort(students, (Student o1, Student o2) -> o1.getAvg() - o2.getAvg());
        for (Student x : students)
        {
            System.out.println(x);
        }
        System.out.println("done");
    }
}

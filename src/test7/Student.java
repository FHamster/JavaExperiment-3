package test7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    private String name;
    private int math;
    private int java;
    private int ds;
    private int avg;
    private int total;

    //构造器
    public Student(String name, int math, int java, int ds)
    {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.total = math + java + ds;
        this.avg = total / 3;
    }

    public Student(String name, int math, int java, int ds, int avg, int total)
    {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.avg = avg;
        this.total = total;
    }

    //Getter and Setter
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMath(int math)
    {
        this.math = math;
        resetAvg();
        resetTotal();
    }

    public void setJava(int java)
    {
        this.java = java;
        resetAvg();
        resetTotal();
    }

    public void setDs(int ds)
    {
        this.ds = ds;
        resetAvg();
        resetTotal();
    }

    private void resetAvg()
    {
        this.avg = (math + java + ds) / 3;
    }

    private void resetTotal()
    {
        this.total = math + java + ds;
    }

    public String getName()
    {
        return name;
    }

    public int getMath()
    {
        return math;
    }

    public int getJava()
    {
        return java;
    }

    public int getDs()
    {
        return ds;
    }

    public int getAvg()
    {
        return avg;
    }

    public int getTotal()
    {
        return total;
    }

    @Override
    public String toString()
    {
        return String.format("%s %d %d %d %d %d", name, math, java, ds, avg, total);
    }

    //随机生成一个学生
    public static Student randomStudent()
    {
        return new Student("张三", getScore(), getScore(), getScore());
    }

    //获取0-100的随机数
    public static int getScore()
    {
        return (int) (Math.random() * 101);
    }

    //重写比较器
  /*  @Override
    public int compareTo(Student o)
    {
        if (this.avg < o.avg)
        {
            return 1;
        } else if (this.avg > o.avg)
        {
            return -1;
        }
        return 0;
    }

*/
    public static Student[] readStudentsFromFile()
    {
        File FileIO = new File("src/test7/Students.txt");
        ArrayList<Student> stuList = new ArrayList<Student>();
        Scanner fileScanner = null;
        try
        {
            fileScanner = new Scanner(FileIO);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        String name;
        int math;
        int java;
        int ds;
        int avg;
        int total;

        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(" ");

            name = lineScanner.next();
            math = lineScanner.nextInt();
            java = lineScanner.nextInt();
            ds = lineScanner.nextInt();
            avg = lineScanner.nextInt();
            total = lineScanner.nextInt();
            stuList.add(new Student(name, math, java, ds, avg, total));
        }
        Student[] stuArr = new Student[stuList.size()];
        stuArr = stuList.toArray(stuArr);
        fileScanner.close();
        return stuArr;
    }

    public static void writeStudentsToFile()
    {
//        捕捉未找到文件异常
        File FileIO = new File("src/test7/Students.txt");
        try
        {
            PrintWriter out = new PrintWriter(FileIO);
            for (int i = 0; i < 10000; i++)
            {
                out.println(Student.randomStudent().toString());
            }
            out.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("用人话说就是没找到文件");
        }
    }

    //排序学生并输出
 /*   public static void sortAndOut(Student[] students)
    {
        Arrays.sort(students);

        for (Student x : students)
        {
            System.out.println(x);
        }
    }*/
}
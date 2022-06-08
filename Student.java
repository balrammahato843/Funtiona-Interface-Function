package Funtional_Interface_Function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
//        Function<Integer,Integer> f=i->i*i;
//        System.out.println(f.apply(4));
//        System.out.println(f.apply(5));

//        Function<String,Integer> f=s -> s.length();
//        System.out.println(f.apply("Balram Mahato"));

//        Function<String,String> f=s -> s.toUpperCase();
//        System.out.println(f.apply("Balram Mahato"));


    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

    class Test16
    {
        public static void main(String[] args)
        {
            Function<Student, String> f = s ->
            {
                int marks = s.marks;
                String grade = "";
                if (marks >= 80) grade = "A[Distinction]";
                else if (marks >= 60) grade = "B[Frist class]";
                else if (marks >= 50) grade = "C[Second class]";
                else if (marks >= 35) grade = "D[Third class]";
                else grade = "E[Failed]";
                return grade;

            };
            //Predicate<Student> p=s->s.marks>=60;

            Student[] s = {
                    new Student("Balram", 100),
                    new Student("uttam", 65),
                    new Student("Tanveer", 55),
                    new Student("Rahul", 45),
                    new Student("Maneesh", 25)
            };

            for (Student s1 : s)
            {

                {
                   // if (p.test(s1)) {
                        System.out.println("Student Name:" + s1.name);
                        System.out.println("student marks:" + s1.marks);
                        System.out.println("Student grade:" + f.apply(s1));
                        System.out.println();
                    }
                }
            }
        }
  //  }



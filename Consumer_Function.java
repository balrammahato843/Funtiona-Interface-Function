package Funtional_Interface_Function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//class Consumer_Function
//{
//    public static void main(String[] args) {
//
//        Function<Integer, Integer> f1 = i -> 2 * i;
//        Function<Integer, Integer> f2 = i -> i * i * i;
//        System.out.println(f1.andThen(f2).apply(2));
//        System.out.println(f1.compose(f2).apply(2));
//    }
//}


class Student1 {
    String name;
    int marks;

    Student1(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

class Test17 {
    public static void main(String[] args) {
        Function<Student1, Object> f = s ->
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
        Predicate<Student1> p = s -> s.marks >= 60;
        Consumer<Student1> c = s1 ->
        {
            System.out.println("Student Name:" + s1.name);
            System.out.println("student marks:" + s1.marks);
            System.out.println("Student grade:" + f.apply(s1));
            System.out.println();
        };


        Student1[] s = {
                new Student1("Balram", 100),
                new Student1("uttam", 65),
                new Student1("Tanveer", 55),
                new Student1("Rahul", 45),
                new Student1("Maneesh", 25)
        };

        for (Student1 s1 : s) {
            if (p.test(s1)) {
                c.accept(s1);
            }
        }
    }
}




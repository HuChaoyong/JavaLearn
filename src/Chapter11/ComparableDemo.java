package Chapter11;

import java.util.Arrays;

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) {
            return -1;
        } else if (this.score < o.score) {
            return 1;
        } else {
            if (this.age > o.age) {
                return -1;
            } else if (this.age < o.age) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Student[] stu = {
                new Student("ZhangSan", 20, 90.0f),
                new Student("LiSi", 22, 99.0f),
                new Student("WangWu", 21, 100.0f),
                new Student("ZhaoLiu", 23, 90.0f),
        };

        Arrays.sort(stu);
        for (Student st: stu) {
            System.out.println(st);
        }
    }
}

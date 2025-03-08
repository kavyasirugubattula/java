import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age=" + age +",name=" + name +"]";
    }
}

public class Comparators {
    public static void main(String[] args){

        Comparator<Student> com = (i,j) -> i.age>j.age?1:-1;

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(13,"Kavya"));
        studs.add(new Student(10,"Balaji"));
        studs.add(new Student(18,"Prasanna"));
        studs.add(new Student(23,"Sathya"));

        Collections.sort(studs, com);

        for(Student s:studs){
        System.out.println(s);
        }
    }
}

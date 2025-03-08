import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student [age="+ age +"  ,  name= " + name +"]";
    }
    @Override
    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }
        else
            return -1;
    }
}

public class Comparables {
    public static void main(String[] args) {
     
        List<Student> studs = new ArrayList<Student> ();
        studs.add(new Student(10,"Kavya"));
        studs.add(new Student(15,"Sathya"));
        studs.add(new Student(18,"Kavitha"));
        studs.add(new Student(2,"Kusu"));

        Collections.sort(studs);

        for(Student n:studs){
        System.out.println(n);
        }
    }
}

class A{
    public void showTheDataWhichtBelongsToThisClass(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

//We have different annotations like override,Deprecated to slove the bugs in complie time 
//Override tells the what is this bug so we can slobve the bug easily
//Deprecated means if you want to use the code use it but don't use it means some want to your code it generate the code is deprecated

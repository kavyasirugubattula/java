/*/public class Array {
    public static void main(String[] args){
        int n[] = {4,5,2,8};
        n[3] = 10;
        System.out.println(n[3]);
    }
}/*/ 
public class Array{
    public static void main(String[] args){
        int n[] = new int[5];
        n[0] = 4;
        n[1] = 5;
        n[2] = 10;
        n[3] = 50;
        n[4] = 1;
        for(int i=0;i<5;i++){
            System.out.println(n[i]);
        }
    }
}

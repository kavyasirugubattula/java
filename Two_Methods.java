class Computer{
    public void PlayMusic(){
        System.out.println("Music Playing...");
    }
    public String GetMeAPen(int cost){
        if(cost>=10)
            return "pen";
        return "No pen";
    }
}

public class Two_Methods {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.PlayMusic();
        String str = com.GetMeAPen(5);
        System.out.println(str);
    }
}

package Exercise.java;

public class Exercise6 {
    public static void main(String[] args) {
        int a=100;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.println("odd number is:"+i);
            }
            System.out.println("\n");
            if(i%2==0){
                System.out.println("even number is:"+i);
            }
        }
    }
}

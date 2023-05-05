package Exercise.java;

public class Exercise28 {
    public static void main(String[] args) {
        long starttime=System.nanoTime();
        System.out.println("printing of 0 to 10");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
   long endtime=System.nanoTime()-starttime;
        System.out.println("seconds:"+endtime+" ");
    }
}

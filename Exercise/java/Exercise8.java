package Exercise.java;

public class Exercise8 {
    public static void main(String[] args) {
        int a=100;
        for(int i=1;i<=a;i++) {
            if (i % 3 == 0) {
                System.out.println("divided by 3:" +"="+ i);
            }
        }
        System.out.println("  ");
        for(int j=1;j<=a;j++){
            if(j%5==0){
                System.out.println("divided by 5:"+"="+j);
            }
        }
        System.out.println("  ");
        for(int k=1;k<=a;k++){
            if(k%3==0&&k%5==0){
                System.out.println("divided by 3 and 5:"+k);
            }
        }
    }
}

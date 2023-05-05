package Exercise.java;

public class Exercise29 {
    public static void main(String[] args) {
        String found =" ";
        String found1;
        int a[]={10,10,3,4,56,20,20};
        for(int i=0;i<a.length;i++){
            if((a[i]==10&&a[i+1]==10)||(a[i]==20&&a[i+1]==20)) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}

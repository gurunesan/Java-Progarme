package Exercise.java;

public class Exercise30 {
    public static void main(String[] args) {
        int b=0;
        int c=0;
        int a[]={2,5,8,5,3,9,22};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
               b++;
            }else{
                c++;
            }
        }
        System.out.println("number odd presents:"+c++);
        System.out.println("number even number presents:"+b++);
    }
}

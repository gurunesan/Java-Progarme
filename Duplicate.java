public class Duplicate {
    public static void main(String[] args){
        String a[]={"fds","fgof","guru","kjdf","fff","jtyi","mm","ggt","guru","mm","ggt"};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if((a[i]).equals (a[j])&&(i!=j)){
System.out.println(a[j]);
                }
            }
        }
    }
}

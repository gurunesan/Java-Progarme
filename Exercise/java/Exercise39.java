package Exercise.java;

public class Exercise39 {
    public static void main(String[] args) {
       boolean[][]a={{true,false,true},{false,true,false}};
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++){
               if(a[i][j]){                  //it has both row and columns;
                   System.out.print("t");
               }else{
                   System.out.print("f");
               }
           }
           System.out.println();
       }
    }
}

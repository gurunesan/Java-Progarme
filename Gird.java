public class Gird {
    public static void main(String[] args){
        int j=0;
        int a[][]=new int[10][10];
        for(int i=0;i<10;i++) {

            for (j = 0; j < 10; j++) {

                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}   

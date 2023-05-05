public class Common {
    public static void main(String[] args) {
        int i = 0;
        int j=0;
        int a[] = {4,8,3,9,1};
        int b[] = {4,8,0,7,1};
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == (b[j])) {
                System.out.println(a[i]);
                }
            }
        }
    }
}
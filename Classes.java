public class Classes {
    public static void main(String[] args) {
        outer obj1=new outer();
    outer. inner obj2=obj1.new inner();
        System.out.println(obj1.x+obj2.y);
    }
}
class outer {
    int x = 5;

    class inner {
        int y = 10;
    }
}

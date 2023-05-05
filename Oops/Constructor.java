package Oops;

public class Constructor {
    String uname;
    String uno;

    Constructor(String name, String no) {
       this. uname = name;
       this. uno = no;
    }

    public void dis() {
        System.out.println(uname);
        System.out.println(uno);

    }
}
    class get{
        public static void main(String[] args) {
            Constructor obj=new Constructor("guru","9885549954959495");
            obj.dis();
        }

}

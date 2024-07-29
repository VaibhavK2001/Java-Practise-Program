class Base{
    public void m1(){
        System.out.println("Base m1");
    }
    public void m2(){
        System.out.println("Base m2");
    }
}
class Sub extends Base{
    public void m1(){
        System.out.println("Sub m1");
    }
    public void m3(){
        System.out.println("Sub m3");
    }
}

public class Test extends Sub{

    public void m3(){
        System.out.println("Test m3");
    }
    public static void main(String[] args) {
        Base obj= new Test();
        obj.m1();
        obj.m2();
        // obj.m3();
    }
}
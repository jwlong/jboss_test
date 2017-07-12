import org.junit.Test;

/**
 * Created by longjinwen on 12/07/2017.
 */
public class TestRefClass {
    @Test
    public void test1(){
        //String t1 = new String();
        String t1 = "";
        String t2 = new String("t2 string");

        t1 = t2;
        t2 = " t2 string again ";
        System.out.println(t1);
    }

    @Test
    public void test2(){
        String t1 ="";
        String t2 = "";
        t1 = t2;
        t1 = "t1 string";
        System.out.println(t2);
    }
    @Test
    public void test3(){
        A a1 = new A();
        A a2 = new A();
        a1.setI(12);
        a2 = a1; // 这个就是把a1的地址赋值给a2 ,a2持有着a1的地址。
        //当a2.setI(11) 同时也会把a1的i的值给更新。
        a2.setI(11);
        System.out.println(a2.getI());
        System.out.println(a1.getI());
    }

    @Test
    public  void test4(){
        A a = new A();
        a.setI(28);
        B b = new B(a);
      //  a.setI(11);
        convert(a);
        System.out.println(b.getA().getI());

    }
    private void convert(A a){
        a.setI(10);
    }

}
class B{
    public B(A a) {
        this.a = a;
    }

    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    private int k;
}


class A{
    private int i;
    private int m;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
}
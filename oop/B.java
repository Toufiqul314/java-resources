
public class B extends A {

    public int x = 20;
    // public int y=25;
    // public void  method1(){
    //     //int y=45;
    //     System.out.println(y); // local ->Own instance -> parent instance
    //     System.out.println(this.y); //own instance -> parent instance
    //     System.out.println(super.y); // parent instance
    // }

    public void method2() {
       // int x = 45;
        System.out.println(x); // own instance/static -> parent instance/static
        System.out.println(this.x); //won instance/static->parent instance / static
        System.out.println(super.x);//parent instance / static
       // System.out.println(B.x); // static -> parent class -> parent class
        System.out.println(A.x); // 
    }
}

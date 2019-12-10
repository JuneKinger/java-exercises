package exercises;

//Interface
interface Interface{
    //abstract methods
    public abstract int multiplyTwo(int n1, int n2);

    /* We need not mention public and abstract in interface
     * as all the methods in interfaces are
     * public and abstract by default so the compiler will
     * treats this as public abstract multiplyThree(int n1, int n2, int n3);
     */
    int multiplyThree(int n1, int n2, int n3);

    /* Regular (or concrete) methods are not allowed in an interface
     * so if I uncomment this method, I will get compilation error
     * public void disp(){
     *    System.out.println("I will give error if u uncomment me");
     * }
     */
}

class DemoInterface implements Interface{
    public int multiplyTwo(int num1, int num2){
        return num1*num2;
    }
    public int multiplyThree(int num1, int num2, int num3){
        return num1*num2*num3;
    }
    public static void main(String args[]){
        Interface obj = new DemoInterface();
        System.out.println(obj.multiplyTwo(3, 7));
        System.out.println(obj.multiplyThree(1, 9, 0));
    }
}

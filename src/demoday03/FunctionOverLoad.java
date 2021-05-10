package demoday03;

public class FunctionOverLoad {
    //函数的重载
    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(add(7,8,9));
    }
    //定义一个加法的运算，获取两个数和
    public static int add(int a,int b){
        return a+b;

    }
    //定义一个加法的运算，获取三个数和
    public static  int add(int a,int b,int c){
        return a+b+c;
    }
}

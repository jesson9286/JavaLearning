package demoday03;

public class Function {
    public static void main(String[] args) {
        int c = sum(5);//  如果直接写  sum（5） 这样只是单纯的调用并无打印输出

        System.out.println("C="+c);
        getResult(5);//用到void时  可以这样打印
        System.out.println("这两个数的结果是："+result(5,6));
    }
    public static int sum(int a){ //pubilc static 要记得写

        return a*3+5;
    }
    //函数的格式
    /*
    修饰符  返回值类型  返回值名称 （参数列表）{
        执行语句；
        return 返回值名称；
    }

     */
    //函数如果是用void以外的都必须要要return，有void可以省略不写
    public static void getResult( int a ){
        System.out.println("void C="+(a*3+5));
    }

    public static String result(int a,int b){
        if(a==b){
            return "相同";
        }else{
            return "不同";
        }

    }
}

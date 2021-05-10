package demoday03;

//进制转换的代码


import java.lang.reflect.Array;

public class FunctionDemo04_0501 {
    public static void main(String[] args) {
        toBin(2);//二进制
        System.out.println("ーーーーーーーーー");
//        toHex(60);
        System.out.println(" ーーーーーーーーーーー  ");
//        System.out.println(Integer.toBinaryString(60));
    }
    //二进制
    public static void  toBin(int num){
        char[] chs = {'0','1'};
        char[] arr = new char[32];
        int pos = arr.length;

        while (num != 0){
            int temp = arr[num] & 1;
            arr[--pos] = chs[temp];
            num = num >>> 1;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }


    //十进制----> 十六进制
//    public static  void toHex(int num) {
//        char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        char[] arr = new char[8];
//        int pos = arr.length;//定义一个指针变量（就是数组对应的指标）等于arr.length表示长度只有arr这个数组的长度而且是从数组后面开始存入
//        while (num != 0){
//            int temp = num & 15;
//            arr[--pos] = ch[temp];//
//            num = num >>> 4;
//        }
//        System.out.println(pos);
//        for (int i =pos;i< arr.length;i++){
//            System.out.print(arr[i]+",");
//        }
//    }
}

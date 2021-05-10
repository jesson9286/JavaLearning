package demoday03;

public class FuctionDay03 {
    //定一个功能 打印99乘法表
    public static void main(String[] args) {
        print99(8);
//        print99(4);
        print99();

    }
    public static void print99(int x){
        int sum =0;
        for(int i = 0 ;i <= x ; i++){

            for(int j = 0 ;j <= i ; j++){
                System.out.print(i+"*"+j+"="+(i*j)+" ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void print99(){
        //为了代码的简洁可以直接调用相同的函数
        print99(9);

//        for(int i = 0 ;i <= 9 ; i++){
//
//            for(int j = 0 ;j <= i ; j++){
//                System.out.print(i+"*"+j+"="+(i*j)+" ");
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
    }


}


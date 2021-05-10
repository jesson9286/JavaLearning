package demoday03;

//进制转换的代码


public class FunctionDemo04_05 {
    public static void main(String[] args) {
        toBin(6);//二进制
        toHex(60);
        System.out.println(Integer.toBinaryString(60));
    }



    //十进制---> 二进制
    public static  void toBin(int num){
        StringBuffer sb = new StringBuffer();

        while (num > 0){
//            System.out.println(num%2);
            sb.append(num%2);
            num = num /2;

        }
        System.out.println(sb.reverse());
    }
    //十进制----> 十六进制
    public static  void toHex(int num){
        StringBuffer sb16 = new StringBuffer();

        for(int x = 0;x < 8;x++){

            int temp = num & 15;
            if(temp > 9){
//                System.out.print((char)(temp-10+'A'));
                sb16.append((char)(temp-10+'A'));
            }else{
//                System.out.print(temp);
                sb16.append(temp);
            }
            num = num >>> 4;
        }
//
        System.out.println("----");
        System.out.println(sb16.reverse());
    }
}

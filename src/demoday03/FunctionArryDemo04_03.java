package demoday03;

//数组的最值获取


public class FunctionArryDemo04_03 {
    public static void main(String[] args) {
        int[] arr =new int[]{2,4,5,6,7,8,5,4,33};
//        double[] arr ={3.4,3.56,5.6,7.7,8.8};

//        int max = arryMax(arr);
//        System.out.println(max);
        System.out.println("最大值是： "+arryMax(arr));
        System.out.println(arryMax_2(arr));
    }
    public static int arryMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
//            }else {
//                System.out.println("最大值是："+max);
//            }
        }
        return max;
    }
    //方法2  利用数组的角标初始化为0 的元素来比较
    public static int arryMax_2(int[] arr){
        int max = 0; //这个时表示数组中的角标 0 元素；
        for (int i = 0; i < arr.length; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return arr[max];
    }
    //重载的使用
    public static double arrMax_2(double[] arr){
       return arrMax_2(arr);
    }
}

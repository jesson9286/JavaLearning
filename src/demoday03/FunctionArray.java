package demoday03;

public class FunctionArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,35,6,7,8,9};
        int sum = 0;
        System.out.println(sum);
        printarry(arr);
    }
    public  static void printarry(int[] arr){
        System.out.print("打印数组："+"[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1) {
                System.out.print(arr[i] + ",");
            }else {
                System.out.println(arr[i]+"]");
            }
        }
    }
}

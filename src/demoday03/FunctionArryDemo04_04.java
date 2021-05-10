package demoday03;

//数组的元素排序
//选择排序

public class FunctionArryDemo04_04 {
    public static void main(String[] args) {
        int[] arr = {5,7,34,2,7,1,9};

        arryDec(arr);  //排序前打印  遍历了数组
        System.out.println("排序前打印");
        selectSort(arr);
        arryDec(arr);//虽然是进行排序， 但是需要对数组进行遍历打印   排序后打印
        System.out.println("排序后打印");
        //冒泡排序
        bubbleSort(arr);
        arryDec(arr);
    }
    //选择排序
    public static  void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {//-1是减少一次比较
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j]){

//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] =temp;
                    swap(arr,i,j);
                }
            }
        }

    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        System.out.println("冒泡排序");
        for (int i = 0; i < arr.length-1; i++) {
            for(int x = 0; x < arr.length-i-1;x++){// -x:让每次比较的元素都少一个。 -1:是为了不让角标元素越界
                if(arr[x] > arr[x+1]){
//                    int temp = arr[x];
//                    arr[x] = arr[x+1];
//                    arr[x+1] = temp;
                    swap(arr,x,x+1);
                }
            }
        }
    }
    //遍历数组
    public static void arryDec(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                System.out.print(arr[i]+",");
            }
            else {
                System.out.print(arr[i]+"]");
            }
        }
    }
    public static void swap(int[] arr,int a,int b){//不管什么排序，他们相同的都是位置置换，所以把这个相同的进行函数封装
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

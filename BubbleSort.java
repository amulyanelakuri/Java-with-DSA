public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {2,1,0,5,9,4};
        int n = arr.length;

        System.out.println("Before the Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println();
        System.out.println("After the Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    
}

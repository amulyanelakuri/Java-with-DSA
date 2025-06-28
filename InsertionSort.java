public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {2,6,5,9,1,0};
        int n = arr.length;

        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--; 

            }
            arr[j+1] = key;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    
}

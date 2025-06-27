public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {3,6,4,1,9,0,7};
        int n = arr.length;
        int temp =0;


        System.out.println("Before Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");

        }

        for(int i =0 ;i<n-1;i++){
            int min = arr[i];
            for(int j =i+1;j<n;j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for(int num : arr){
            System.out.print(num+" ");
    }
    
}
}

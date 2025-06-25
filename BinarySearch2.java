public class BinarySearch2 {
    public static int binarysearch(int[] arr,int target){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        
        while(start <= end){
            int mid = start +(end-start) /2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
       
    }
    public static void main(String[] args){
        int[] arr = {2,3,7,9,11,17};
        int target = 11;
        int result = binarysearch(arr, target);
        System.out.println(result);
    }
    
}

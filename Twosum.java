import java.util.HashMap;
import java.util.Map;
public class Twosum {
public int[] twosum(int[] n,int target){
    //Key: number in the array
    //Value: its index in the array
    Map<Integer,Integer>map = new HashMap<>();

    for(int i=0;i<n.length;i++){
        int num = n[i];
        int value = target - num;
    
    if(map.containsKey(value)){
        return new int[] { map.get(value), i };
    }
     map.put(num, i);
}
return new int[] {};
}
public static void main(String[] args){
    Twosum ts = new Twosum();
    int[] n = {2,4,5,1,3};
    int target = 7;
    int[] result = ts.twosum(n,target);
     System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}
}




public class Sortedarr {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
           return false;
        }
        return isSorted(arr, idx+1);
    }public static void main(String[] args) {
        int arr[] = {23,3,1,4,6,8,9};
        
        System.out.println(isSorted(arr, 0));
    }
}

package mo.must.day7.searchMethods;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(method(array, 6));
    }

    public static int method(int[] array,int target){
        int min = 0;
        int max = array.length-1;
        while(min<=max){
            int mid = (min+max)>>1;
            if(array[mid]> target){
                max = mid-1;
            }
            else if(array[mid]<target){
                min = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}

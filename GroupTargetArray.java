public class GroupTargetArray {
 
    public static  int[] groupTarget(int[] arr, int target) {
         int j = arr.length-1;
         int temp;
        for(int i=0;i<j;i++){
            while(arr[j] == target){
               j--;
            
            }
            if (arr[i] == target && arr[j] != target) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                j--;
            }
          //  System.out.println(i+" "+arr[i]);

        }
        arr[5] = 0;
        return arr;
    }

    
    public static void main(String[] args) {
        int[] array = { 6,1,6,8,10,4,15,6,3,9,6 };
        int target = 6;
        int[] result = groupTarget(array, target);

          for (int i = 0; i < result.length; i++) {
                  System.out.println(result[i]);
         }

    }
}

// output:
// 9
// 1
// 3
// 8
// 10
// 0
// 15
// 6
// 6
// 6
// 6



import java.util.HashSet;
import java.util.Set;

public class CheckSumArray {

    public static int[] checkSum(int[] arr, int target) {

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             return new int[]{ arr[i], arr[j] };
        //         }
        //     }
        // }
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int match = target - num;

            if (nums.contains(match)){
               return new int[]{num,match};
            }else{
              nums.add(num);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = { 3, 6, 9, 8, 5, 4, 0 };
        int target = 10;
        int[] result = checkSum(array, target);


        for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
        }

    }
}


// output:
//     6
//     4
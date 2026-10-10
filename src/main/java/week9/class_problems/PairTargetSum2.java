
import java.util.HashSet;

public class PairTargetSum2 {

    static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(target - num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 6};
        int target = 20;

        System.out.println(hasPairWithSum(nums, target));
    }
}

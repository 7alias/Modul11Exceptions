public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        for (int i : nums) {
            i += nums[i+1];
        }
    }
}

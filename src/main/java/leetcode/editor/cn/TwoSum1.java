package leetcode.editor.cn;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9865 👎 0


public class TwoSum1 {
    public static void main(String[] args) {
        Solution solution = new TwoSum1().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ret = new int[2];
            int i;
            int j;
            a:
            for (i = 0; i < nums.length; i++) {
                for (j = i + 1; j < nums.length; j++) {
                    if ((target == nums[i] + nums[j]) && i != j) {
                        ret[0] = i;
                        ret[1] = j;
                        break a;
                    }
                }
            }
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
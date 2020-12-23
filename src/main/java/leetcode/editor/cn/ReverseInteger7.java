package leetcode.editor.cn;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2409 👎 0


public class ReverseInteger7 {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger7().new Solution();
        Object obj = solution.reverse(1534236469);
        System.out.println(obj);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int ans = 0;
            while (x != 0) {
                int pop = x % 10;
                if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                    return 0;
                if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                    return 0;
                ans = ans * 10 + pop;
                x /= 10;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
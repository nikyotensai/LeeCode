package leetcode.editor.cn;

//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下： 
//
// L   C   I   R
//E T O E S I I G
//E   D   H   N
// 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// string convert(string s, int numRows); 
//
// 示例 1: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 3
//输出: "LCIRETOESIIGEDHN"
// 
//
// 示例 2: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 4
//输出: "LDREOEIIECIHNTSG"
//解释:
//
//L     D     R
//E   O E   I I
//E C   I H   N
//T     S     G 
// Related Topics 字符串 
// 👍 941 👎 0


public class ZigzagConversion6 {
    public static void main(String[] args) {
        Solution solution = new ZigzagConversion6().new Solution();
        String ret = solution.convert("LEETCODEISHIRING", 4);
        System.out.println(ret);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (s == null || s.length() <= 1) {
                return s;
            }
            String[] rows = new String[Math.min(s.length(), numRows)];

            int loc = 0;
            boolean direDown = true;
            for (int i = 0, len = s.length(); i < len; i++) {
                char c = s.charAt(i);
                rows[loc] = (rows[loc] == null ? "" : rows[loc]) + c;
                if (loc == numRows - 1) {
                    direDown = false;
                } else if (loc == 0) {
                    direDown = true;
                }
                loc = direDown ? loc + 1 : loc - 1;
            }
            StringBuilder sb = new StringBuilder();
            for (String row : rows) {
                sb.append(row);
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
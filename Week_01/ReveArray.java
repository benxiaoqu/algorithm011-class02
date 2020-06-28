/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 解法：
 *  1.设置一个新数组，遍历旧数组，将旧数组的元素+n的位置上的数放到新数组中
 *  2.旋转n次，每次用一个临时变量存储交换的变量
 */
public class ReveArray {

    /**
     * 大致想出了解法，没有写出来，用了官方写法
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

}

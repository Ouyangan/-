package com.roadmap.algorithm.leetcode;

//路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次 。该路径 至少包含一个 节点，且不
//一定经过根节点。
//
// 路径和 是路径中各节点值的总和。
//
// 给你一个二叉树的根节点 root ，返回其 最大路径和 。
//
//
//
// 示例 1：
//
//
//输入：root = [1,2,3]
//输出：6
//解释：最优路径是 2 -> 1 -> 3 ，路径和为 2 + 1 + 3 = 6
//
// 示例 2：
//
//
//输入：root = [-10,9,20,null,null,15,7]
//输出：42
//解释：最优路径是 15 -> 20 -> 7 ，路径和为 15 + 20 + 7 = 42
//
//
//
//
// 提示：
//
//
// 树中节点数目范围是 [1, 3 * 104]
// -1000 <= Node.val <= 1000
//
// Related Topics 树 深度优先搜索 递归
// 👍 1046 👎 0
public class Leetcode124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return max;
    }

    /**
     * 从根节点出发,经过每条路径的和最大值
     * 1. 叶子节点为其本身
     * 2. 非叶子节点路径和 节点值+左子节点最大值+右子节点最大值 和的最大值
     * <p>
     * 实现思路是递归
     *
     * @param node
     */
    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftMax = Math.max(maxGain(node.left), 0);
        int rightMax = Math.max(maxGain(node.right), 0);
        int currMax = leftMax + rightMax + node.val;
        max = Math.max(max, currMax);
        return node.val + Math.max(leftMax, rightMax);
    }
}

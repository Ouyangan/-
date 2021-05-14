package com.roadmap.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//
// 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,2,3]
//输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//
//
// 示例 2：
//
//
//输入：nums = [0]
//输出：[[],[0]]
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// nums 中的所有元素 互不相同
//
// Related Topics 位运算 数组 回溯算法
// 👍 1171 👎 0
public class Leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTrace(nums,0,path,result);
        return result;
    }

    private void backTrace(int[] arr, int index, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        if (index == arr.length) {
            return;
        }
        for (int i = index; i < arr.length; i++) {
            path.add(arr[i]);
            backTrace(arr, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}

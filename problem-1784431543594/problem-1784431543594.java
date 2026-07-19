// Last updated: 7/19/2026, 8:55:43 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {int count=0;
17    public int countDominantNodes(TreeNode root) {
18        dfs(root);
19        return count;
20    }
21                private int dfs(TreeNode node){
22                    if(node==null){
23                        return Integer.MIN_VALUE;
24                    }
25                    int left=dfs(node.left);
26                    int right=dfs(node.right);
27                    int max=Math.max(node.val,Math.max(left,right));
28                    if(node.val==max){
29                        count++;
30                    }
31                    return max;
32                    
33                }
34}
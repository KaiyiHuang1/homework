<<<<<<< HEAD:src/main/java/com/techbow/homework/y2021/m09/boyuan/小宋小宋/BFS_102.java
package com.techbow.homework.y2021.m09.boyuan.小宋小宋;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;


public class TreeNode {
    int val;
     TreeNode left;
    TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
          this.right = right;
      }
 }
public class BFS_102 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        levelOrderHelper(root, 0);
        return res;
    }

    private void levelOrderHelper(TreeNode root, int level) {
        if (res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);

        if (root.left != null) levelOrderHelper(root.left, level + 1);
        if (root.right != null) levelOrderHelper(root.right, level + 1);
    }
}
=======
package com.techbow.homework.y2021.m09.xiaosongxiaosong;

import java.util.ArrayList;
import java.util.List;


public class BFS_102 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        levelOrderHelper(root, 0);
        return res;
    }

    private void levelOrderHelper(TreeNode root, int level) {
        if (res.size() == level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);

        if (root.left != null) levelOrderHelper(root.left, level + 1);
        if (root.right != null) levelOrderHelper(root.right, level + 1);
    }
}
>>>>>>> a1e7104c76f408e735a7c87017ab95e8de29924f:src/main/java/com/techbow/homework/y2021/m09/xiaosongxiaosong/BFS_102.java

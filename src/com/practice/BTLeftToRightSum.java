package com.practice;

import java.util.*;

class BTLeftToRightSum {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    return brnachSum(root, 0, new ArrayList<Integer>());
  }
	
	 static ArrayList<Integer> brnachSum(BinaryTree tree, int sum, ArrayList<Integer> list){
		int newzsum = sum + tree.value;
		
		if(tree.left==null && tree.right==null){
			 list.add(newzsum);
            return list;
		}
		brnachSum(tree.left, newzsum, list);
		brnachSum(tree.right, newzsum, list);
		
		return list;
	}
	
}

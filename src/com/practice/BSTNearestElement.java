package com.practice;

public class BSTNearestElement {
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        if(target== tree.value)
            return tree.value;
        int closestValue=Integer.MAX_VALUE;
        while( tree !=null ){

            if(Math.abs(target - closestValue) >
                    Math.abs(target - tree.value)){
                closestValue=tree.value;

            }
            if(target > tree.value){
                tree=tree.right;
            }else if(target < tree.value){
                tree=tree.left;
            }else{
                break;
            }

        }

        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}


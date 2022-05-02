class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      //Below 3 are corner cases.
        if(root==null && subRoot==null)
            return true;
        else if(root!=null && subRoot==null)
            return false;
        else if(root==null && subRoot!=null)
            return false;
        
        if(root.val==subRoot.val){ //If we found the value of a mainTree node matching the subTree node we then try checking the subTree in mainTree. 
            if(match(root,subRoot))
                return true;
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot); //recursively we check the value of each node at a time(left or right) of mainTree with subTree.
    }
    
  //Below method checks for the subTree in mainTree.
    private boolean match(TreeNode root, TreeNode subRoot){
      //Below 2 if & else if statements are corner cases.
        if(root==null && subRoot==null)
            return true;
        else if(root==null || subRoot==null)
            return false;
        if(root.val==subRoot.val)
            return match(root.left,subRoot.left) && match(root.right,subRoot.right); //We then recursively check the left and right node value of subTree & mainTree.
        
        return false;
        }
}

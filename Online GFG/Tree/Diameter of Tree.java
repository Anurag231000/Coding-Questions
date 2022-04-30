class Solution {
  
    int res=0;
    int diameter(Node root) {
        
        if(root==null)
			    return 0;
        
        heightOfTree(root);
        
        return res;
    }
    
  /*T.C : Theta(n)
  *A.S.C : Theta(h)
  * 
  *LOGIC : We get the height of left tree and right tree and last included with the root. In the end we return the maximum height among the 3 heights.
  */
    private int heightOfTree(Node root) {
		if(root==null)
			return 0;
		
		int lh = heightOfTree(root.left);
		int rh = heightOfTree(root.right);
		
		res = Math.max(res,(lh+rh+1));
		
		return Math.max(lh,rh)+1;
	}
}

class Solution {
  
    int res=0;
    int diameter(Node root) {
        
        if(root==null)
	   return 0;
        
        heightOfTree(root);
        
        return res;
    }
    
  /*T.C : O(N*N) ( For every node, Height Function is called which takes O(N) time hence for every node it becomes N*N ) 
  *A.S.C : O(1) ( Extra Space ) + O(H) ( Recursive Stack Space where “H” is the height of tree )
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

/*OPTIMIZED SOLUTION
1.Using Post Order Traversal : https://takeuforward.org/data-structure/calculate-the-diameter-of-a-binary-tree/
*/

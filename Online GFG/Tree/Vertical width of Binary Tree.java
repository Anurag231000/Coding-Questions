/* T.C : Theta(n)
A.S.C : Theta(h)

LOGIC : We are using the horizontal distance logic here, we traverse the left and right tree, for every left tree traversal we do hd-1 and for every right tree traversal
we do hd+1. For root we have hd=0, we are using Set DS in order to store the unique hd values. 
Last the size of the Set is the vertical width of the Binary Tree.
*/

class Tree
{
    public static int verticalWidth(Node root)
	{
	    if(root==null)
	        return 0;
	    
	    Set<Integer> s = new HashSet<>();
	    
	    width(root,s,0);
	    
	    return s.size();
	}
	
	
	private static void width(Node root, Set<Integer> s, int hd){
	    
	    if(root==null)
	        return;
	    
	    width(root.left,s,hd-1);
	    s.add(hd);
	    width(root.right,s,hd+1);
	}
}

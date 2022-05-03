/*T.C : O(n)
A.S.C : O(n) Reason: Worst case time complexity will be O(N) (in case of skewed tree).

LOGIC : Here we are converting the binary tree into inorder traversal to doublyLL. We are basically repeating the three steps.
Inorder Traversal : left root right
1. This step get to run only once, when we encounter the first node which is the leftmost child in case of inorder traversal.
2. We store the node that we encountered in a variable temp, now this temp variable will be acting as a prev node for the new node.
3. When we encounter the next node then we make the current(next node) node's prev point to temp and temp's next to current node.
We repeat all the above 2-3 steps in an inorderly fashion untill all the nodes are traversed.
*/
class Solution
{
     /* next = right
        prev = left
    */
    Node head=null,temp=null;
    Node bToDLL(Node root)
    {
        if(root==null)
			return null;
		
	   bToDLL(root.left);
	    if(head==null){      ---> 1 
	        head=root;
	    }else{               ---> 3
	      root.left=temp; 
        temp.right=root;
	    }
	    temp=root;           ---> 2
	    bToDLL(root.right);
	   
	   return head;
    }
    
}

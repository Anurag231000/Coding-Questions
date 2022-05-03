/*
T.C : Theta(n)
A.S.C : O(n)

LOGIC : We store the head of the linkedlist as a root node in queue, then we move to the next node of linkedlist, we store the latest linkedlist node as left child,
at the same time we store this left child in the queue so that next time we remove the node from queue it will become the new parent node, we do the same above steps
for the right child until the queue gets empty and traversing of linkedlist gets completed.
*/
class GfG 
{   
    public static Tree convert(Node head, Tree node) {
        if(head==null){
            node=null;
            return node;
        }
        
        Queue<Tree> q = new LinkedList<>();
        Tree root = new Tree(head.data);
        q.add(root);
        head=head.next;
      
        while(!q.isEmpty() && head!=null){
            Tree parent=q.poll();
            
           Tree leftChild=null, rightChild=null;
           
           if(head!=null){
               leftChild= new Tree(head.data);
               q.add(leftChild);
               head=head.next;
           }
           
           if(head!=null){
               rightChild= new Tree(head.data);
               q.add(rightChild);
               head=head.next;
           }
           parent.left=leftChild;
           parent.right=rightChild;
        }
        return root;
    }
}  

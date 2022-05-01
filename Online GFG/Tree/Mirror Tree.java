/*T.C : Theta(n)
A.S.C : O(1)

LOGIC : We traverse the left tree and right tree and until we reach the leaf nodes and then we swap the left and right nodes by using extra temp node.
*/

class Solution {
    
    void mirror(Node node) {
        if(node==null)
            return;
        else{
            mirror(node.left);
            mirror(node.right);
            
            Node temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
    }
}

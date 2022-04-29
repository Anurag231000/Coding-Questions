/*Here the only difference is the hash function, the logic and -ve test case check is same as linear probing. To understand below code please go through linear probing
java file once. 
*/
class Solution{
    //Function to fill the array elements into a hash table 
    //using Quadratic Probing to handle collisions.
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
    {
        for(int i=0; i<hash_size; i++)
            hash[i]=-1;
        
        for(int i=0; i<N; i++){
            int val=1;
            int key=arr[i]%hash_size;
            
            if(hash[key]==arr[i])
                continue;
            
            if(hash[key]==-1){
                hash[key]=arr[i];
            }else{
                int quad_key=(arr[i]+(val*val))%hash_size;
                while(hash[quad_key]!=-1){
                    if(quad_key==key)
                        return;
                        
                    if(hash[quad_key]==arr[i])
                        break;
                    else{
                        val++;
                        quad_key=(arr[i]+(val*val))%hash_size;
                    }
                }
                hash[quad_key]=arr[i];
            }
        }
        
    }
}

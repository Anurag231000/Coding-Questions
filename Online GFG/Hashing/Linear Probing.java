class Solution{
    
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int[] table = new int[hash_size];
        
        for(int i=0; i<hash_size; i++)
            table[i]=-1;
        
        
        for(int i=0; i<sizeOfArray; i++){
            int index=1;
            int hash=arr[i]%hash_size;
            
            if(table[hash]==arr[i]) //If the hash table already contains the element then skip the current iteration. 
                continue;
            
            if(table[hash]==-1){
                table[hash]=arr[i]; //If the element is new & unique we are inserting the element in hash table.
            }else{
                int hash_key=(arr[i]+index)%hash_size; /*If there already an element in hashtable at hash location
                then increase the hash location by 1*/
                while(table[hash_key]!=-1){    //Iterate the hash table until you find the empty location.
                    if(hash_key==hash)      //This means that we have come full circle and there is no space remainning in hash table.
                        return table;
                        
                    if(table[hash_key]==arr[i]) //Its a duplicate check
                        break;
                    else{
                        index++;
                        hash_key=(arr[i]+index)%hash_size; // we keep on increasing the hash location by 1 until it satisfies the above 2 conditions or we finally found the empty location.
                    }
                }
                table[hash_key]=arr[i];
            }
        }
        return table;
    }
    
}

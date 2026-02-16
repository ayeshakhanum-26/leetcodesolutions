class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    { 
        ArrayList<Integer> res = new ArrayList<>();
    boolean [] seen = new boolean[nums.length+1];
    for(int i :nums)
    {
        seen[i] = true;

    } 
    for(int i=1;i<=nums.length;i++)
    {
        if(!seen[i]){
            res.add(i);
        }
    }
    return res;

        
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int five=0,ten=0;
        for(int i=0;i<bills.length;i++)//billss is array name
        {
            if(bills[i]==5)
            {
                five=five+1;
            }
            else if(bills[i]==10)
            {
                if(five>0)
                {
                    ten++;
                    five--;//give 5rs channge
                } else return false;
            }
            else
            {
                if(ten>0 && five>0)
                {
                    ten--;//20-10
                    five--;//10-5
                }
                else if(five>=3)
                {
                    five=five-3;//5,5,5 change for 20rs
                }
                else 
                {
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public int numberOfSubstrings(String s) {


        //Window
        int[] count = {0,0,0};
        int n = s.length();
        int j=0;

        int result=0;


        for (int i =0; i< n; i++)

        {
            ++count[s.charAt(i) - 'a'];
        


        while(count[0]> 0 && count[1]>0 && count[2]>0)
        {
             --count[s.charAt(j) - 'a'];
             j++;

        }

        result = result + j;
       }

        return result;
    }
}
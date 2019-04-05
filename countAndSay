class Solution {
    public String countAndSay(int number) {
        String answer = "1";
        for(int i = 1; i < number;  i++)
        {
            StringBuilder temp = new StringBuilder();
            char[] ans = answer.toCharArray();
            for(int j = 0; j < ans.length; j++)
            {
                int count = 1;
                while( j < ans.length - 1 &&  ans[j] == ans[j + 1] )
                {
                    count++;                      
                }
                temp.append(count);
                temp.append(ans[j]);
            }
            answer = temp.toString();
        }
        return answer;
    }
}
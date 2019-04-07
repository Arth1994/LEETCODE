class DecodeWays {
    public int numDecodings(String s) { 
        if(s.length() == 0 || s == null)
            return 0;
        
        int len = s.length();
        
        int cache[] = new int[len + 1];
        
        cache[0] = 1;
        
        if(s.charAt(0) != '0')
            cache[1] = 1;
        else
            cache[1] = 0;
        
        for(int i = 2; i <= len; i++)
        {
            int one = Integer.valueOf(s.substring(i - 1, i));
            int two = Integer.valueOf(s.substring(i - 2, i));
            if(one >= 1 && one <= 9)
                cache[i] += cache[i - 1];
            if(two >= 10 && two <= 26)
                cache[i] += cache[i - 2];
        }
        return cache[len];
    }
}
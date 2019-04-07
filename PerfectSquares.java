class PerfectSquares {
    public int numSquares(int n) {
        if(n <= 3)
            return n;
        
        int cache[] = new int[n + 1];
        
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 3;
        
        for(int i = 4; i <= n; i++)
        {
            cache[i] = i;
            for(int j = 1; j <= i; j++){
                int curr = j*j;
                if(curr > i)
                    break;
                else
                    cache[i] = Math.min(cache[i], 1 + cache[i - curr]);
            }
        }
        return cache[n];
    }
}
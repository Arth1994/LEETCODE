class MinimumSwaps {
    public int minSwap(int[] A, int[] B) {
        int len = A.length;
        int[] swappedArr = new int[1000];
        int[] nonSwappedArr = new int[1000];
        swappedArr[0] = 1;
        for(int i = 1; i < len; i++){
            swappedArr[i] = nonSwappedArr[i] = len;
            if(A[i - 1] < A[i] && B[i - 1] < B[i]){
                swappedArr[i] = swappedArr[i - 1] + 1;
                nonSwappedArr[i] = nonSwappedArr[i - 1];
            }
            if(A[i - 1] < B[i] && B[i - 1] < A[i]){
                swappedArr[i] = Math.min(swappedArr[i], nonSwappedArr[i - 1] + 1);
                nonSwappedArr[i] = Math.min(nonSwappedArr[i], swappedArr[i - 1]);
            }
        }
        return Math.min(swappedArr[len - 1], nonSwappedArr[len - 1]);
    }
}
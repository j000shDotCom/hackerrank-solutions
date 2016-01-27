class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 1 + (n != 1 ? n : 0);
        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if(n % i == 0)
                sum += i + (n/i);
        }
        return sum;
    }
}

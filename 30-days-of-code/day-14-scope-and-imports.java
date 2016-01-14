    Difference(int[] a) {
        elements = a;
    }

    void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int e : elements) {
            min = Math.min(min, e);
            max = Math.max(max, e);
        }
        maximumDifference = max - min;
    }

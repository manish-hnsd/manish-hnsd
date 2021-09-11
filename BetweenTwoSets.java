class BetweenTwoSets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        System.out.println(getTotal(a, b));
    }
    int getLCM(int n1, int n2) {
    if (n1 == 0 || n2 == 0)
      return 0;
    else {
      int gcd = getGCD(n1, n2);
      return Math.abs(n1 * n2) / gcd;
    }
    }

     int getGCD(int n1, int n2) {
        if (n2 == 0) {
        return n1;
        }
        return getGCD(n2, n1 % n2);
    }
    
    public int getTotal(int a[], int b[]){
        int results = 0;
        // Get LCM of all elements of a
        int lcm = a[0];
        for (Integer integer : a) {
            lcm = getLCM(lcm, integer);
        }

        // Get GCD of all elements of b
        int gcd = b.get(0);
        for (Integer integer : b) {
        gcd = getGCD(gcd, integer);
        }

        // Count multiples of lcm that divide the gcd
        int multiple = 0;
        while (multiple <= gcd) {
        multiple += lcm;
        if (gcd % multiple == 0)
        result++;
        }
        return result;
    }
}
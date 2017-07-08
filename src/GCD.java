/**
 * Created by sagarsuri on 08/07/17.
 * Today we will be looking at gcd implementation in different ways.
 * 1) Euclidean Algorithm
 * 2) Binary Algorithm (Its considered as one of the fastest algorithm to get GCD of 2 numbers)
 */
public class GCD {
    public static void main(String[] args) {
        int[][] test = {{12,24},{144,441}};

        //Using euclid's algorithm
        System.out.println("Using Euclid's Algorithm gcd of 12 and 24 is :"+findGCDUsingEuclid(test[0][0],test[0][1]));

        //Using binary algorithm
        System.out.println("Using Binary Algorithm gcd of 36 and 64 is: "+findGCDUsingBinary(test[1][0],test[1][1]));

    }

    private static int findGCDUsingBinary(int p, int q) {
        if (q == 0) return p;
        if (p == 0) return q;

        // p and q even
        if ((p & 1) == 0 && (q & 1) == 0) return findGCDUsingBinary(p >> 1, q >> 1) << 1;

            // p is even, q is odd
        else if ((p & 1) == 0) return findGCDUsingBinary(p >> 1, q);

            // p is odd, q is even
        else if ((q & 1) == 0) return findGCDUsingBinary(p, q >> 1);

            // p and q odd, p >= q
        else if (p >= q) return findGCDUsingBinary((p-q) >> 1, q);

            // p and q odd, p < q
        else return findGCDUsingBinary(p, (q-p) >> 1);
    }

    private static int findGCDUsingEuclid(int a, int b) {
        if(b==0){
            return a;
        }else{
            return findGCDUsingEuclid(b,a%b);
        }
    }

}

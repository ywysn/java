
    class Solution4 {
        public int fib(int N) {
            if(N==0){
                return 0;
            }
            if(N == 1){
                return 1;
            }
            return fib(N-1)+fib(N-2);
        }
    }
public class Fib {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        //sol.fib(2);
        System.out.println(sol.fib(0));
    }
}

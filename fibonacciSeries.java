public class fibonacciSeries {
        public int fib(int n) {
            
            //base case
            if(n ==0 ){
                return 0;
            } if (n ==1 ){
                return 1;
            }
    
            //kaam
            int ans1 = fib(n-1);
            int ans2 = fib(n-2);
            return (ans1+ans2);
        }
        public static void main(String[] args) {
            fibonacciSeries fibb = new fibonacciSeries() ;

            //// Test cases
            System.out.println("Fibonacci of 0: " + fibb.fib(0)); // Output: 0
            System.out.println("Fibonacci of 1: " + fibb.fib(1)); // Output: 1
            System.out.println("Fibonacci of 2: " + fibb.fib(2)); // Output: 1
            System.out.println("Fibonacci of 3: " + fibb.fib(3)); // Output: 2
            System.out.println("Fibonacci of 4: " + fibb.fib(4)); // Output: 3
            System.out.println("Fibonacci of 5: " + fibb.fib(5)); // Output: 5
            System.out.println("Fibonacci of 10: " + fibb.fib(10)); // Output: 55
        }
    
}


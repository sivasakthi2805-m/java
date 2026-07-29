public class primenumber {
    public static void main(String[] args) {
        int num=12;
        for(int i=2;i<=num/2;i++){
            if (num % i==0){
                System.out.println("not a prime number");
                return;
            }
        }
            System.out.println("prime number" );
    }
}

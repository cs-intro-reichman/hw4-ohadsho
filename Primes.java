public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i=0;
        int j=0;
        int primeCounter =0;
        boolean[] prime = new boolean[n+1];
        for(int k=2 ; k<n+1 ; k++){
            prime[k] = true;
        }
        System.out.println("Prime numbers up to "+ n+":");

        while(i <= n){
            while(i <= n && prime[i] == false){
                i++;
            }
            if(i<n+1){
            System.out.println(i);
        }
            while(j<=n){
                if(j%i == 0){
                    prime[j] = false;
                }
                j++;
            }
            
            j=0;
            primeCounter++;
        }
        primeCounter--;
        
        System.out.println("There are " + primeCounter+ " primes between 2 and " + n +" ("+ (int)(100.0/((double)n/(double)primeCounter)) +"%" +" are primes"+ ")");
    }
}
    


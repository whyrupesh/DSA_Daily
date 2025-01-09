//Find all prime numbers upto n;

public class Main {
    public static void main(String[] args){
        int n = 100;
        simpleSieve(n);
    }

    public static void simpleSieve(int n){

        boolean[] numbool = new boolean[n];

        for(int i=0;i<n;i++){
            numbool[i]=true;
        }

        for(int i=2;i<Math.sqrt(n);i++){
            if(numbool[i]==true){
                for(int j=i*i;j<n;j=j+i){
                    numbool[j]=false;
                }
            }
        }
        System.out.println("All primes till "+n);
        for(int i=0;i<n;i++){
            if(numbool[i]==true){
                System.out.print(i+" ");
            }
        }
        
    }
    
}

//Find all prime numbers upto n;

import java.util.*;

public class Main {
    static int n=1000;
    static boolean[] numbool = new boolean[n];

    static void simpleSieve(int n){
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
    }

    static ArrayList<Integer> generatePrime(int n){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=2;i<Math.sqrt(n);i++){
            if(numbool[i]==true){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String args[]){
        int low = 80;
        int high = 90;
        simpleSieve(1000);

        ArrayList<Integer> ai = generatePrime(high); //2,3,5,7

        boolean boolvar[] = new boolean[high-low+1];

        for(int i=0;i<high-low+1;i++){
            boolvar[i]=true;
        }
        // {true,true,true,true,.....}

        for( int prime : ai){
            int firstDiv = (low/prime)*prime;
            if(firstDiv<low){
                firstDiv = firstDiv+prime;
            }

            // int m = Math.max(firstDiv,prime*prime);

            for(int j=firstDiv;j<(high);j=j+prime){
                boolvar[j-low]=false;
            }

            for(int i=low;i<high;i++){
                if(boolvar[i-low]==true){
                    System.out.println(i);
                }
                
            }



        }


    }
    
  
}

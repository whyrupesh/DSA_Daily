public class Main{
    public static void main(String[] args){
        int a[] = {5,7};
        int b[] = {1,3};
        int m = 2;
        int p=1;
        
        for(int i=0;i<b.length;i++){
            p = p*b[i];
        }
        System.out.println(remaindertheorem(a,b,m));
        System.out.println(chineseTheorem(a,b,m,p));
    }

    public static int chineseTheorem(int a[],int b[],int m,int p){
        int x=0;

        for(int i=0;i<m;i++){
            int M = p/b[i];
            int y=0;
            for(int j=0;j<b[i];j++){
                if((M*j)%b[i]==1){
                    y=j;
                    break;
                }
            }
            x= x+a[i]*M*y;
        }
        return x%p;
    }
    public static int remaindertheorem(int a[],int b[],int m){
        
        int x=1;
        
        while(true){
            int i;
            for(i=0;i<m;i++){
                if(x%a[i]!=b[i]){
                    break;
                }
            }
            if(i==m){
                return x;
            }
            x++;
        }
    }
}
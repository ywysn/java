public class Mul{
    public static void main (String [] arga){
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println(Rec(20));
    }
    public static double Rec(double n){
        if(n==1){
          return 1;
        }else{
             return n*Rec(n-1);
            }
    }
}
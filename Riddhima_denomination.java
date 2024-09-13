import java.util.*;
class denomination{
    int amt;
    denomination (int a){
        amt = a;
    }
    public static void main (String[] agrs){
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter your amount");
        int am = sc.nextInt();
        denomination obj = new denomination (am);
        obj.name();
        obj.calculate();
        sc.close();
    }
    void name(){
        System.out.println ("input value is");
        int am = amt;
        String F[] = {"one", "two", "three","four","five","six","seven","eight","nine"};
        String W[] = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String T[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        if (am >=1000){
                int d = am/1000;
                System.out.print(F[d-1]+" thousand ");
                am = am - 1000*(d);
            }
        if (am >=100){
                int d = am/100;
                System.out.print(F[d-1]+" hundred ");
                am = am - 100*(d);
            }
        if (am >= 20) {
            int d = am / 10;
            System.out.print( W[d - 1] + " ");
            am = am - 10*d;
            }
        else if (am > 10 && am < 20) {
            System.out.print (T[am - 11] + " ");
            am = 0;
        } else if (am == 10) {
            System.out.print ("ten ");
            am = 0;
        }
        if (am > 0 && am < 10) {
             System.out.print(F[am - 1] + " ");
        
        }
        System.out.println ();
    }
    void calculate(){
        System.out.println ("denominations are \n--------------------------");
        int A[] = {1000,500,100,50,20,10,5,2,1};
        int c = 0;
        for (int i =0;i<A.length;i++){
            if (amt /A[i]>0){
                System.out.println ("₹"+A[i]+" = "+(amt/A[i])+" notes");
                c += amt/A[i];
                amt = amt - A[i]*(amt/A[i]);
            }
        }
        System.out.println ("total notes used are "+c);
        System.out.println ("--------------------------");
    }
}
import java.util.*;
class Random
{
    int one=0,two=0,five=0,ten=0,twenty=0,fifty=0,h=0,fh=0,thousand=0;
     void highestDomination(int x) 
     {
        thousand=x/1000; x%=1000;
        fh=x/500; x%=500;
        h=x/100; x%=100;
        fifty=x/50; x%=50;
        twenty=x/20; x%=20;
        ten=x/10; x%=10;
        five=x/5; x%=5;
        two=x/2;
        one=x/1;
    }
    void display(int x)
    {
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("BANK DENOMINATIONS BREAK-UP");
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Input amount => $"+x+"\nDenominations :");
        System.out.println("-------------------------------------------------");
        if(thousand!=0)
        System.out.println("$1000 \t=\t"+thousand);
        if(fh!=0)
        System.out.println("$500 \t=\t"+fh);
        if(h!=0)
        System.out.println("$100 \t=\t"+h);
        if(fifty!=0)
        System.out.println("$50 \t=\t"+fifty);
        if(twenty!=0)
        System.out.println("$20 \t=\t"+twenty);
        if(ten!=0)
        System.out.println("$10 \t=\t"+ten);
        if(five!=0)
        System.out.println("$5 \t=\t"+five);
        if(two!=0)
        System.out.println("$2 \t=\t"+two);
        if(one!=0)
        System.out.println("$1 \t=\t"+one);
        int sum=one+two+five+ten+twenty+fifty+h+fh+thousand;
        System.out.println("------------------------------------------------------");
        System.out.println("Total notes =\t"+sum);
        System.out.println("-------------------------------------------------------");
    }
    public static void main(String[] args) 
    {
        Random ob= new Random();
        Scanner sc= new Scanner(System.in);
        boolean f=true;
        while(f)
        {
            System.out.println("Enter the amount");
            int x=sc.nextInt();
            ob.highestDomination(x);
            ob.display(x);
            System.out.println("Do you want to enter another amount? (yes/no)");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("No"))
            f=false;
        }
        sc.close();
    }
}

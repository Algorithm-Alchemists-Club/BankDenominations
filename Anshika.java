import java.util.*;
class Anshika
{   int S=0; int c; int P=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
         S=sc.nextInt();//original amount
         sc.close();
    }
    void count()
    {   int t=S;
        while(t!=0)
        {
            int d=t%10;//remainder
            t=t/10;//quotient
            c++;//counting the digits
        }
        P=(int)Math.pow(10,(c-1));//storing the divisor
    }
    int thousand=0;int hundred=0;int ten=0; int tenthousand=0;int two=0;int rupee_one=0; int twenty=0; int fivethousand=0; int fivehundred=0; int fifty=0;int five=0; 
    void process()
    {
      thousand=0;ten=0;tenthousand=0; two=0;fivethousand=0;fivehundred=0;fifty=0;five=0;twenty=0;rupee_one=0;//reinitializing the values
    int note;int t2=S;int d2=0; //new variables taken for chopping
    count();//calling the function to get the value of P
       while(t2 !=0)
        {  
        d2=t2%P;//remainder
        t2=t2/P;//quotient
        note=t2;//number of notes
         switch(P)
           {
              case 10000:tenthousand=10*note; break;// gives number of 1000's 10000's values
              
              case 1000: thousand=note+tenthousand; 
              break;
        
            case 100: hundred=note; break;
        
            case 10:ten=note;break;
             case 1:two=note;break;
          }
    
      while(hundred > 4)
      {
        fivehundred++; hundred=hundred-5;// distributing the value of 100's notes into 500's
      }
      
      while( ten > 4)
     { 
        fifty++; ten=ten-5;
     }
     while(ten>=2 && ten<5)
     { twenty++; ten=ten-2;
        }
     
     while( two > 4)
     {
        five++; two=two-5;
     }
     if(two%2!=0)
     { rupee_one++; two=two-1;
        }
      
      t2=d2;P=P/10; 
    
}
}

 void display()
 {  input();process();
     if(thousand!=0)
     System.out.println("1000 note: "+thousand);
     if(fivehundred!=0)
     System.out.println("500 note: "+fivehundred);
     if(hundred!=0)
     System.out.println("100 note: "+hundred);
     if(fifty!=0)
     System.out.println("50 note: "+fifty);
     if(twenty!=0)
     System.out.println("20 note: "+twenty);
     if(ten>0)
     System.out.println("10 note: "+ten);
     if(five>0)
     System.out.println("5 note: "+five);
    
     if(two>0)
     System.out.println("2 note: "+two);
      if(rupee_one>0)
     System.out.println("1 note: "+rupee_one);
     
    }
    void redo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to enter another amount, Enter 1 for yes/ 2 for no");
        int r=sc.nextInt();
        if(r==1)
        display();
       sc.close();
    }
    void main()
    {
        Anshika obj=new Anshika();
        obj.display();
        obj.redo();
    }
        
}
     
     
        
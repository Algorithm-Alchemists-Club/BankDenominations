import java.util.*;
class mon_ey{
   Scanner sc= new Scanner(System.in);
     void idk(int m){
        int n=m;//valid till 8 digits. i was too lazy ot make further.
        int s=0;
    int a[]={1000,500,100,50,20,10,5,2,1};
    int b[]={0,0,0,0,0,0,0,0,0};
    for(int i=0;i<9;i++){
        if(n>=a[i]){
        b[i]=n/a[i];
        n%=a[i];
        }
    }
    System.out.println("========================================");
    System.out.println("=======BANK DENOMINATION BREAK-UP=======");
    System.out.println("========================================");
    System.out.print("Input Amount "+m+" : ");wo(m);
    System.out.println();
    for(int i=0;i<9;i++){
        if(b[i]!=0){
        if(i==6||i==7||i==8)
        System.out.println("₹"+a[i]+" : "+b[i]+" chillar");  

        else
        System.out.println("₹"+a[i]+" : "+b[i]+" notes");
        }
        s=s+b[i];
    }
    System.out.println("TOTAL NOTES : "+s);
    System.out.println("wanna do again hm??");
    System.out.println("(Y)es,(N)o");
        char ans = Character.toUpperCase(sc.nextLine().charAt(0));
    switch (ans) {
            case 'Y':
                main(null);
                break;
            case 'N':
                break;
            default:
                System.out.println("Blind Fella");
                break;
        }
  }
  void wo(int n){
    String a=Integer.toString(n);
    int m=n;
    int l=a.length();
    int x[]=new int[l];
    for(int i=l-1;i>=0;i--){
          x[i]=m%10; 
          m/=10;
    }
    String th[]= {"Hundred","Thousand","Lakhs","Crore"};
    String d[]={"Ten"};//for the og 10 nigga.
    String nums[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String tens[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety" };
    if(n<20)
       System.out.println(nums[n]);
    if(n>20&&n<100)
       System.out.println(""+tens[x[0]]+" "+nums[x[1]]);
    if(n>100&&n<1000)
       System.out.println(""+nums[x[0]]+" "+th[0]+" "+tens[x[1]]+" "+nums[x[2]]);
    if(n>1000&&n<10000)
       System.out.println(""+nums[x[0]]+" "+th[1]+" "+nums[x[1]]+" "+th[0]+" "+tens[x[2]]+" "+nums[x[3]]);
    if(n>10000&&n<100000)
       System.out.println(""+tens[x[0]]+" "+nums[x[1]]+" "+th[1]+" "+nums[x[2]]+" "+th[0]+" "+tens[x[3]]+" "+nums[x[4]]);
    if(n>100000&&n<1000000)
       System.out.println(""+nums[x[0]]+" "+th[2]+" "+tens[x[1]]+" "+nums[x[2]]+" "+th[1]+" "+nums[x[3]]+" "+th[0]+" "+tens[x[4]]+" "+nums[x[5]]);
    if(n>1000000&&n<10000000)
       System.out.println(""+tens[x[0]]+" "+nums[x[1]]+" "+th[2]+" "+tens[x[2]]+" "+nums[x[3]]+" "+th[1]+" "+nums[x[4]]+" "+th[0]+" "+tens[x[5]]+" "+nums[x[6]]);
    if(n>10000000&&n<100000000)
       System.out.println(""+nums[x[0]]+" "+th[3]+" "+tens[x[0]]+" "+nums[x[1]]+" "+th[2]+" "+tens[x[2]]+" "+nums[x[3]]+" "+th[1]+" "+nums[x[4]]+" "+th[0]+" "+tens[x[5]]+" "+nums[x[6]]);
    if(n==10)
    System.out.println(d[0]);
    if(n==100)
    System.out.println(nums[1]+" "+th[0]);
    if(n==1000)
    System.out.println(nums[1]+" "+th[1]);
    if(n==10000)
    System.out.println(d[0]+" "+th[1]);
    if(n==100000)
    System.out.println(nums[1]+" "+"Lakh");
    if(n==1000000)
    System.out.println(d[0]+" "+th[2]);
    if(n==10000000)
    System.out.println(nums[1]+" "+th[3]);
    else if(n>=100000000)
        System.out.println("TOO LAZY TO PRINT");
    }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     mon_ey call=new mon_ey();
     System.out.print("enter value: ");
                int o=sc.nextInt();
     call.idk(o);
     sc.close();
  }
}
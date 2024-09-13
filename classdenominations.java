class denominations
{
    public static void main(int x)
    {
        int tt=0;
        int fh=0;
        int th=0;
        int oh=0;
        int fifty=0;
        int twenty=0;
        int ten=0;
        int five=0;
        int two=0;
        int one=0;
        for(int i=x;i!=0;)
         {
            while((i-2000)>2000)
            {
                tt++;
                i-=2000;
            }
            while((i-500)>500)
            {
                fh++;
                i-=500;
            }
            while((i-200)>200)
            {
                th++;
                i-=200;
            }
            while((i-100)>100)
            {
                oh++;
                i-=100;
            }
            while((i-50)>50)
            {
                fifty++;
                i-=50;
            }
            while((i-20)>20)
            {
                twenty++;
                i-=20;
            }
            while((i-10)>10)
            {
                ten++;
                i-=10;
            }
            while((i-5)>5)
            {
                five++;
                i-=5;
            }
            
            while((i-2)>2)
            {
                two++;
                i-=2;
            }
            while((i-1)>1)
            {
                one++;
                i-=1;
            }

        }

        System.out.println("2000 - "+tt);
        System.out.println("500 - "+fh);
        System.out.println("200 - "+th);
        System.out.println("100 - "+oh);
        System.out.println("50 - "+fifty);
        System.out.println("20 - "+twenty);
        System.out.println("10 - "+ten);
        System.out.println("5 - "+five);
        System.out.println("2 - "+two);
        System.out.println("1 - "+one);
       
        }
    }

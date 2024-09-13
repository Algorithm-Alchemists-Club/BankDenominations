import java.util.Scanner;

class zVatsalDixit
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        boolean progrepeat = true;

        while (progrepeat) 
        {
            int[] d = new int[12];

            System.out.println("Enter N for normal usage / Enter C for customized usage (N/C)");
            char ch = ob.next().charAt(0);

            if (ch == 'N') 
            {
                d = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
            } else if (ch == 'C')
            {
                System.out.println("Enter the denominations you want. Enter 0 to stop:");
                for (int i = 0; i < d.length; i++)
                {
                    d[i] = ob.nextInt();
                    if (d[i] == 0)
                    {
                        break;
                    }
                }
            } 
            else 
            {
                System.out.println("Invalid choice! Please enter either 'N' or 'C'.");
                continue;
            }

            System.out.println("Enter the amount:");
            int amt = ob.nextInt();
            System.out.println("==============================================");
            System.out.println("         BANK DENOMINATION BREAKUP");
            System.out.println("==============================================");
            System.out.println("Input Amount: ₹" + amt);

            int[] notes = new int[d.length];
            int totalNotes = 0;

            for (int x = 0; x < d.length; x++)
            {
                if (amt >= d[x] && d[x] > 0)
                {
                    notes[x] = amt / d[x];
                    amt = amt % d[x];
                    totalNotes += notes[x];
                }
            }

            System.out.println("Denominations:");
            System.out.println("==============================================");
            for (int i = 0; i < d.length; i++)
            {
                if (notes[i] > 0)
                {
                    System.out.println("₹" + d[i] + ": " + notes[i]);
                }
            }
            System.out.println("==============================================");
            System.out.println("Total notes used: " + totalNotes);
            System.out.println("==============================================");
            System.out.println("Amount remaining: ₹" + amt);

            System.out.print("\nDo you want to enter another amount? (yes/no): ");
            String userResponse = ob.next();
            if (userResponse.equalsIgnoreCase("no"))
            {
                progrepeat = false;
                System.out.println("Program terminated.");
            }
        }

        ob.close();
    }
}

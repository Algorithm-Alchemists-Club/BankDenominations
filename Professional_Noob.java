import java.util.*;

public class Professional_Noob {
    static List<Integer> notes = new ArrayList<>();
    static List<Integer> breakup = new ArrayList<>();
    static List<String> notations = new ArrayList<>();
    int L;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    String ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    String tens[] = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    String t1[] = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };

    void fill_Currency() {
        notes.add(2000);
        notes.add(1000);
        notes.add(500);
        notes.add(100);
        notes.add(50);
        notes.add(20);
        notes.add(10);
        notes.add(5);
        notes.add(2);
        notes.add(1);
        notations.add("");
        notations.add(" Thousand ");
        notations.add(" Million ");
        notations.add(" Billion ");
        notations.add("Trillion");
    }

    void chop(int x) {
        for (int i = x, c = 0; i != 0 && c < 9; i %= notes.get(c), c++) {
            breakup.add(i / notes.get(c));
            sum += i / notes.get(c);
        }

        L = breakup.size();
    }

    String words(int x) {
        String s = String.valueOf(x);
        String ans = "";
        if (s.length() == 1)
            ans = ones[s.charAt(0) - 48];
        else if(s.length()==2){
            if (s.charAt(0) == '1') {
                if (s.charAt(1) != '0')
                    ans = t1[s.charAt(1) - 48]+ans;
                else
                    ans = tens[1]+ans;
            } else
                ans = tens[s.charAt(0) - 48] + ones[s.charAt(1) - 48]+ans;
        }
        else
        {
            if (s.charAt(1) == '1') {
                if (s.charAt(2) != '0')
                    ans = t1[s.charAt(2) - 48]+ans;
                else
                    ans = tens[1]+ans;
            } else
                ans = tens[s.charAt(1) - 48] + ones[s.charAt(2) - 48]+ans;
                ans = ones[s.charAt(0) - 48] + " Hundred " + ans;
        }
        return ans;
    }

    void Display(int x, String w) {
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("BANK DENOMINATIONS BREAK-UP");
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Amount => $" + x+ "\t"+ w + "\nDenominations :");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < L; i++)
            if (breakup.get(i) != 0)
                System.out.println("$" + notes.get(i) + "\t=\t" + breakup.get(i));
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Notes =\t" + sum);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String args[]) {
        Professional_Noob obj = new Professional_Noob();
        obj.fill_Currency();
        boolean f = true;
        while (f) {
            String w = "";
            System.out.println("Enter the amount");
            int x = obj.sc.nextInt();
            obj.chop(x);
            for (int i = x, c = 0; i != 0; i /= 1000, c++) {
                w = obj.words(i % 1000) + notations.get(c)+w;
            }
            obj.Display(x, w);
            breakup.clear();
            System.out.println("do you want to enter another amount? (yes/no)");
            String choice = obj.sc.next();
            if (choice.equalsIgnoreCase("No"))
                f = false;
        }
    }
}

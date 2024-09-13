import java.util.*;

class money {
    String numberToWord(int n) {

        String S = "";
        String[] units = { "", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        if (n % 100 > 10 && n % 100 < 20) {
            S = units[n % 100] + S;
        } else {
            S = tens[(n % 100) / 10] + " " + units[n % 10] + S;

        }
        int c = (n % 1000) / 100;
        if (c != 0) {
            S = units[c] + " hundred " + S;
        }
        c = n;
        if (c / 1000 > 10 && c / 1000 < 20) {
            S = units[c / 1000] + " thousand " + S;
        } else {
            S = tens[c / 10000] + " " + units[(c % 10000) / 1000] + " thousand " + S;
        }
        return S;
    }

    public static void main(String[] args) {
        money mc = new money();
        int[] note = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the amount(up to 5 digits): ");
            n = sc.nextInt();

        } while (n > 99999);
        sc.nextLine();
        System.out.println("===================================");
        System.out.println("    BANK DENOMINATION BREAK-UP     ");
        System.out.println("===================================");
        System.out.println("Input Amount: " + n + "(" + mc.numberToWord(n) + ")");
        System.out.println("----------------------------");
        int sum = 0;
        for (int m : note) {
            if (n / m < 1)
                continue;
            int c = n / m;
            System.out.println("₹  " + m + " : " + c);
            sum = sum + c;
            n = n - (m * c);

        }
        System.out.println("----------------------------");
        System.out.println("Total notes used = " + sum);
        System.out.println("===================================");
        System.out.println("Do you want to enter another amount? (yes/no):");
        String m = sc.nextLine();
        String[] h = new String[0];
        switch (m) {
            case "yes":
                main(h);
                break;
            case "no":
                break;
            default:
                System.out.println("wrong input");
        }
        sc.close();
    }

}

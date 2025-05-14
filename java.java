import java.util.Scanner;

class Sumeo {
    public static void main(String args[]) {
        int i, n, sum1 = 0, sum2 = 0;
        System.out.print("Enter the number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for (i = 0; i <= n; i=i+2){
            if (i % 2 == 0) {
                sum1 = sum1 + i;
            }
        }
        for(i=1;i<=n;i=i+2) {
            if (i % 2 != 0) {
                sum2 = sum2 + i;
            }
        }

            System.out.println("Even sum: " + sum1);
            System.out.println("Odd sum:" + sum2);
        }
    }

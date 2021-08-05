import java.util.Scanner;
class RunSum {

    public static void main(String args[]) {
        System.out.print("\n Masukkan Data : ");
        Scanner sc = new Scanner(new Scanner(System.in).nextLine());

        runningSum(sc);

    }
    public static void runningSum(Scanner obj) {
        double sum = 0, maxSum = -1;
        System.out.print("\n\n Running Sum = ");

        while (obj.hasNextDouble()) {
            sum = sum + obj.nextDouble();
            System.out.print(sum + " ");
            if (maxSum == -1) {
                maxSum = sum;
            } else {
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.print("\n max sum = " + maxSum + " \n\n");
    }
}

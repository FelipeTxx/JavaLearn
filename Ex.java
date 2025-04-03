import java.util.Scanner;
class Ex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qnums = scanner.nextInt();
        String nums = scanner.nextLine();
        nums = scanner.nextLine();
        String[] Sarraynums = nums.split(" ");
        for(int i = qnums; i>=0;i--){
            double tempNum = Double.parseDouble(Sarraynums[i]);
            double result = Math.sqrt(tempNum);
            System.out.println(result);
        }

        scanner.close();
    }
}
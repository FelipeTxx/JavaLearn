import java.util.Scanner;
import java.util.ArrayList;
class Ex00{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> 
        int qnums = scanner.nextInt();
        String nums = scanner.nextLine();
        nums = scanner.nextLine();
        String[] arrayNums = nums.split(" ");
        for (int i = qnums;i>0;i--){
            Math.sqrt(arrayNums[i]);
        }


        scanner.close();
    }
}

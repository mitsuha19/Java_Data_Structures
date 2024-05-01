import java.util.Scanner;

public class Biner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int test = input;
        int count = 0;
        while (test != 0) {
            test /= 2;
            count++;
        }

        BinerArray biner1 = new BinerArray(count);

        for (int i = 0; i < count; i++) {
            int sisa = input % 2;
            biner1.push(sisa);
            input /= 2;
        }
        biner1.getBinary();
        
        scanner.close();

    }

    
}

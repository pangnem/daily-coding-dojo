import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        System.out.println(new Main().solution(input1, input2));
    }

    private int solution(int input1, int[] input2) {
        int count = 0;
        int max=0;

        for (int i = 0; i < input1; i++) {
            int num = input2[i];
            if (num > max) {
                max = num;
                count++;
            }
        }

        return count;
    }

}

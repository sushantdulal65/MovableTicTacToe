
import java.util.Scanner;

class BasicTicTacToe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tic Tac Toe");
        int choice = 0;
        int turn = 0;
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] winCom = {{0, 1, 2}, {0, 3, 6}, {0, 4, 8}, {1, 4, 7}, {2, 5, 8}, {2, 4, 6}, {3, 4, 5},
        {6, 7, 8}};

        while (true) {
            for (int i = 1; i <= 9; i++) {
                if (choice == i) {
                    arr[i - 1] = turn;
                }
                System.out.print("|" + arr[i - 1]);
                if (i % 3 == 0) {
                    System.out.println("|");
                }
            }
            for (int i = 0; i < 8; i++) {
                if ((arr[winCom[i][0]] != 0) && (arr[winCom[i][0]] == arr[winCom[i][1]])
                        && (arr[winCom[i][0]] == arr[winCom[i][2]])) {
                    System.out.println("\nPlayer " + turn + " wins.");
                    System.exit(0);
                }
            }
            turn = turn % 2 + 1;
            if (turn == 1) {
                System.out.println("Player 1 Turn"); 
            }else {
                System.out.println("Player 2 Turn");
            }
            choice = scanner.nextInt();
            while (choice<1 || choice>9)
            {
                System.out.println("----Wrong Position----\nPlease retry a valid position");
                choice = scanner.nextInt();

            }
            while (arr[choice - 1] != 0) {
                System.out.println("Square already covered.\nChoose different position");
                choice = scanner.nextInt();
            }
        }
    }
}

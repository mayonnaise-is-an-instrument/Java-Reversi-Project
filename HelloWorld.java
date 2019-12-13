import java.util.Scanner;

public class HelloWorld {

   public static void main(String[] args) {

       System.out.println("Hello World!");

   }

}

class Board {
    char[][] rows;

    public Board() {
        char[][] rows = new char[][]{
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        { '.', '.', '.', 'w', 'b', '.', '.', '.'},
        { '.', '.', '.', 'b', 'w', '.', '.', '.'},
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        { '.', '.', '.', '.', '.', '.', '.', '.'},
        };
    }
    public void print() {
        System.out.println("  A B C D E F G H\n");
            for(int row=0; row<8; row++) {
                System.out.println(row + 1 + " ");
                for(int column=0; column<8; column++) {
                    System.out.println(rows[row][column] + " ");
                }
                System.out.println(row + 1 + "\n");
            }
            System.out.println("  A B C D E F G H\n");
    }
}

class Game {
    public int board;
    public String player1;
    public String player2;
    public String userInput;

    public Point getMove() {
        int x;
        int y;

        while(true) {
            System.out.println("Enter the space you would like to move.");
            Scanner scan = new Scanner(System.in);
            userInput = scan.nextLine();
            if(userInput.isEmpty()) {
                return null;
            }
            x = userInput.charAt(0);
            y = userInput.charAt(1);
            //x = userInput[0];
            //y = userInput[1];
            if((x>0) && (x<=8) && (y>0) && (y<=8)) {
                return new Point(x, y);
            }
        }

    }
    public int setBoard() {
        return board;
    }
    public String setPlayer1() {
        return player1;
    }
    public String setPlayer2() {
        return player2;
    }
    public String setUserInput() {
        return userInput;
    }
}

class Player {
    public String playerName;
    public char color;

    public String getName() {
            System.out.println("Please enter your name.");
            Scanner scan = new Scanner(System.in);
            playerName = scan.nextLine();
            return playerName;
        }
    public char setColor() {
        return color;
        }
}

class Point {
    public int x;
    public int y;

    public Point(int column, int row) {
        x = column;
        y = row;
    }
}
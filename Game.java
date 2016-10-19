import java.util.Scanner;

public class Game {

	public static String[][] field = new String[][] {
		{"@", "1", "2", "3"},
		{"1", " ", " ", " "},
		{"2", " ", " ", " "},
		{"3", " ", " ", " "}
	};
	
	
	
	public static void main(String[] args) {
		boolean running = true;
		boolean crossTurn = true;
		Scanner scan = new Scanner(System.in);
		
		
		while(running) {
			if(crossTurn) {
				System.out.println("Cross turn.");
				System.out.print("X value? ");
				int xToChange = scan.nextInt();
				System.out.print("Y value? ");
				int yToChange = scan.nextInt();
				if(field[yToChange][xToChange] != "X" && field[yToChange][xToChange] != "O")
					field[yToChange][xToChange] = "X";
				crossTurn = false;
			} else {
				System.out.println("Circle turn.");
				System.out.print("X value? ");
				int xToChange = scan.nextInt();
				System.out.print("Y value? ");
				int yToChange = scan.nextInt();
				if(field[yToChange][xToChange] != "X" && field[yToChange][xToChange] != "O")
					field[yToChange][xToChange] = "O";
				crossTurn = true;
			}
			draw();
		}
	}
	public static void draw() {
		for(int y1 = 0; y1 < 4; y1++)
			System.out.println(field[y1][0] + field[y1][1] + field[y1][2] + field[y1][3]);
	}
}

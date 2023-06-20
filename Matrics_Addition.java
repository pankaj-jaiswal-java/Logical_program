package logical_program;
import java.util.*;

public class Matrics_Addition {
	int row,column;
	int row1,column1;
	int first_matrics[][] = new int[2][2];
	int second_matrics[][] = new int[row1][column1];
	int result[][];
	int a = Integer.MIN_VALUE;
	int b = Integer.MAX_VALUE;
	
	Scanner sc = new Scanner(System.in);
	
	void first_matrics_input() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("Enter row no : ");
		row = sc.nextInt();
		System.out.println("Enter column no : ");
		column = sc.nextInt();
		System.out.println("Enter the value of First Matrics : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				first_matrics[i][j] = sc.nextInt();
			}
		}
	}
	
	void second_Matrics_Input() {
		
		System.out.println("Enter row no : ");
		row1 = sc.nextInt();
		System.out.println("Enter column no : ");
		column1 = sc.nextInt();
		System.out.println("Enter the value of secound Matrics : ");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<column1; j++) {
				second_matrics[i][j] = sc.nextInt();
			}
		}
	}
	
	void matrics_Addition() {
		System.out.println("\n\n first_matric + secound_matrics : \n");
		for(int i=0; i<Math.min(row, row1); i++) {
			for(int j=0; j<Math.min(column, column1); j++) {
				result[i][j] = first_matrics[i][j] + second_matrics[i][j];
			}
		}
	}
	
	void display() {
		for(int i=0; i<Math.max(row, row1); i++) {
			for(int j=0; j<Math.max(column, column1); j++) {
				System.out.println(result[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matrics_Addition ob = new Matrics_Addition();
		ob.first_matrics_input();
		ob.second_Matrics_Input();
		ob.matrics_Addition();
		ob.display();
	}
}



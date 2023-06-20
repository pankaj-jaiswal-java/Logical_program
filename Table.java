package logical_program;

class Example {
	void Main() {
		int n = 1;
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(n*j+"\t");
			}
			n++;
			System.out.println();
		}
	}
}

public class Table {
	public static void main(String[] args) {
		Example e1 = new Example();
		e1.Main();
	}
}

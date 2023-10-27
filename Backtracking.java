package DSA;

public class Backtracking {

	public static void backtrack(int i)
	{
		if(i<5)
			return;
		
		backtrack(i-1);
		System.out.println(i);
	}
	public static void main(String[] args) {
		// Backtracking is an algorith to use the solve problem recursively.
		int i=10;
		backtrack(i);

	}

}

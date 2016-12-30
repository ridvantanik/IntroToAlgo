package towerOfHanoi;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		tower(N, 'S', 'D', 'A');
	}

	// Assuming n-th disk is bottom disk (count down)
	private static void tower(int n, char sourcePole, char destinationPole, char auxiliaryPole) {
		// Base case (termination condition)
		if (0 == n)
			return;

		// Move first n-1 disks from source pole
		// to auxiliary pole using destination as
		// temporary pole
		tower(n - 1, sourcePole, auxiliaryPole, destinationPole);

		// Move the remaining disk from source
		// pole to destination pole
		System.out.println(String.format("Move the disk %d from %c to %c\n", n, sourcePole, destinationPole));

		// Move the n-1 disks from auxiliary (now source)
		// pole to destination pole using source pole as
		// temporary (auxiliary) pole
		tower(n - 1, auxiliaryPole, destinationPole, sourcePole);
	}

}
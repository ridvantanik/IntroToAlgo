package ermanAmazon;

public class Solution1 {

	public static void main(String[] args) {
		
		int [] lockerXCoordinates = new int[2];
		lockerXCoordinates[0] = 2;
		lockerXCoordinates[1] = 4;
		int[] lockerYCoordinates = new int[2];
		lockerYCoordinates[0] = 3;
		lockerYCoordinates[1] = 7;
		
		int [][] result = getLockerDistanceGrid(5, 7, lockerXCoordinates, lockerYCoordinates);
		
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates, int[] lockerYCoordinates){
		int[][] result = new int[cityWidth][cityLength];
		for(int i = 1; i <= cityWidth; i++){
			for(int j = 1; j <= cityLength; j++){
				int temp = 1000;
				for(int k = 0; k < lockerXCoordinates.length; k++){
					if(Math.abs((lockerXCoordinates[k] - j)) + Math.abs((lockerYCoordinates[k] - i)) < temp){
						temp = Math.abs((lockerXCoordinates[k] - j)) + Math.abs((lockerYCoordinates[k] - i));
					}
				}
				result[i - 1][j - 1] = temp;
			}
		}
		
		return result;
	}
	
}

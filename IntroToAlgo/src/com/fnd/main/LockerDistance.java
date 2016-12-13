package com.fnd.main;

public class LockerDistance {
	public static void main(String[] args) {
		int[] lockerXCoordinates = { 2, 4 };
		int[] lockerYCoordinates = { 3, 7 };
		int[][] result = getLockerDistanceGrid(5, 7, lockerXCoordinates, lockerYCoordinates);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	static int[][] getLockerDistanceGrid(int cityLength, int cityWidth, int[] lockerXCoordinates,
			int[] lockerYCoordinates) {
		int[][] result = new int[cityLength][cityWidth];
		for (int i = 1; i <= cityLength; i++) {
			for (int j = 1; j <= cityWidth; j++) {
				int temp = Integer.MAX_VALUE;
				for (int k = 0; k < lockerXCoordinates.length; k++) {
					if (Math.abs((lockerXCoordinates[k] - i)) + Math.abs((lockerYCoordinates[k] - j)) < temp) {
						temp = Math.abs((lockerXCoordinates[k] - i)) + Math.abs((lockerYCoordinates[k] - j));
					}
				}
				result[i - 1][j - 1] = temp;
			}
		}

		return result;
	}
	
	/*
	  import java.util.;
	  import java.io.;
	 *
	 * public List<String> getDirectFriendsForUser(String user)
	 *
	 * public List<String> getAttendedCoursesForUser(String user)
	 *
	 * Please complete the method below
	 */
//	public List<String> getRankedCourses(String user) {
//		List<String> myCourses = getAttendedCoursesForUser(user);
//		List<String> friends = getDirectFriendsForUser(user);
//		
//		for (String friendID : friends) {
//			List<String> courses = getAttendedCoursesForUser(friendID);
//		}
//	}
}

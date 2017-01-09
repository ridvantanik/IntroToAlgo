package ermanAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution1 {

	public List<String> getDirectFriendsForUser(String user) {

		return null;
	}

	public List<String> getAttendedCoursesForUser(String user) {

		return null;
	}

	public List<String> getRankedCourses(String user) {
		List<String> recommendations = new LinkedList<String>();
		
		List<String> userCourses = getAttendedCoursesForUser(user);
		if(userCourses == null){
			userCourses = new ArrayList<String>();
		}
		
		List<String> firstLevelFriends = getDirectFriendsForUser(user);
		Set<String> socialNetwork = new HashSet<String>();
		if(firstLevelFriends != null)
			socialNetwork.addAll(firstLevelFriends);
		
		List<String> secondLevelFriends = null;
		for(int i = 0; i < firstLevelFriends.size(); i++){
			secondLevelFriends = getDirectFriendsForUser(firstLevelFriends.get(i));
			if(secondLevelFriends != null)
			socialNetwork.addAll(secondLevelFriends);
		}
		
		Map<String, Integer> networksCourses = new HashMap<String, Integer>();
		List<String> attendedCourses = null;
		for (String userId : socialNetwork) {
			attendedCourses = getAttendedCoursesForUser(userId);
			if(attendedCourses != null){
				for (String courseId : attendedCourses) {
					if(!userCourses.contains(courseId)){
						networksCourses.put(courseId, networksCourses.get(courseId) + 1);
					}
				}
			}
		}
		
		Object[] a = networksCourses.entrySet().toArray();
		sort(a);
		
		for (Object entry : a) {
			recommendations.add(((Map.Entry<String, Integer>) entry).getKey());
		}
		return recommendations;
	}

	private void sort(Object[] a) {
		Arrays.sort(a, new Comparator<Object>() {
		    public int compare(Object o1, Object o2) {
		        Entry<String, Integer> firstEntry = (Map.Entry<String, Integer>) o2;
				Entry<String, Integer> secondEntry = (Map.Entry<String, Integer>) o1;
				return firstEntry.getValue().compareTo(secondEntry.getValue());
		    }
		});
	}
}

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
import java.util.Random;
import java.util.Set;

public class Solution2 {
	
	public List<String[]> courseList = new ArrayList<String[]>();

	public List<String> getDirectFriendsForUser(String id) {
        Integer userId = new Integer(id);
        List<String> retId = new ArrayList<String>();
        int i,s;
        for(i=2;i<userId;i++) {
            if(userId%i==0)
                retId.add(i + "");
        }
        for(s=userId + 1 ;s<40;s++) {
            if (s%userId == 0)
                retId.add(s + "");
        }
        return retId;
    }

	public List<String> getAttendedCoursesForUser(String id) {
        return Arrays.asList(courseList.get(new Integer(id)));
    }

    public void generateRandomCourses() {

        Random rand = new Random();
        int  number;
        courseList.add(null);
        courseList.add(null);
        for(int i=2;i<40;i++) {
            number = rand.nextInt(20) + 1;
            String temp[] = new String[number];
            for(int s=0;s<number;s++) {
                temp[s] = rand.nextInt(20) + 1 + "";
            }
            courseList.add(temp);
        }
    }

    public void printCourses() {
        for(int i=2;i<40;i++) {
            System.out.print(i + ":::");
            for(int s=0;s<courseList.get(i).length;s++)
                System.out.print(courseList.get(i)[s] + " ");
                System.out.println();
        }
        System.out.println("****************************");
        
        List<String> ret1 = getDirectFriendsForUser("25");
        for(int i=0;i<ret1.size();i++)
            System.out.println(ret1.get(i) + " ");
        
        System.out.println("****************************");
        
        List<String> ret2 = getDirectFriendsForUser("5");
        for(int i=0;i<ret2.size();i++)
            System.out.println(ret2.get(i) + " ");
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
						if(networksCourses.get(courseId)!=null)
							networksCourses.put(courseId, networksCourses.get(courseId) + 1);
						else
							networksCourses.put(courseId, 1);
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
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		sol.generateRandomCourses();
		sol.printCourses();
		sol.getRankedCourses("25");
	}
	
}

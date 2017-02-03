package ermanAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Test {

    static List<String[]> courseList = new ArrayList<String[]>();

    public static void main(String[] args) {

        generateRandomCourses();
        printCourses();
        /*
        List<String> ret1 = getDirectFriendsForUser("2");
        for(int i=0;i<ret1.size();i++)
            System.out.println(ret1.get(i) + " ");
*/
    }

    static List<String> getDirectFriendsForUser(String id) {
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

    static List<String> getAttendedCoursesForUser(String id) {
        return Arrays.asList(courseList.get(new Integer(id)));
    }

    static void generateRandomCourses() {

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

    static void printCourses() {
        for(int i=2;i<40;i++) {
            System.out.print(i + ":::");
            for(int s=0;s<courseList.get(i).length;s++)
                System.out.print(courseList.get(i)[s] + " ");
                System.out.println();
        }
    }

}

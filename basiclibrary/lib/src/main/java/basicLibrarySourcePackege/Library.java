/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrarySourcePackege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("test");
        /**
         * use Roll function
         */
        System.out.println(Arrays.toString(roll(20)));
        /**
         * use containsDuplicates function
         */
        int[] testArr = {1,2,3,4} ;
        System.out.println(containsDuplicates(testArr));
        /**
         * use the lowest average
         */
        int[][] array2D = {{10,10,10} , {2,2,2}};
        System.out.println(lowestAvg2DArr(array2D));
        /**
         * use analysis weather function
         */
                int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
       analizeWeatherData(weeklyMonthTemperatures);
/**
 * use most votes function
 */
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally((ArrayList<String>) votes);
        System.out.println(winner + " received the most votes!");
    }

    /**
     *
     * @param n:  rolls a six-sided dice n times.
     * @return an array containing the values of the rolls.
     */
    public static int[] roll(int n){
        int[] rollDice = new int[n] ;
        for(int i = 0 ; i<rollDice.length ; i++){
            rollDice[i] = (int)(Math.random()*6+1);
        }
        return  rollDice ;
    }

    /**
     *
     * @param arr
     * @return if the array contains an elements duplicates
     */
    public static boolean containsDuplicates(int[] arr){
        ArrayList<Integer> testArr = new ArrayList<>() ;
        for(int i  = 0; i < arr.length ; i++){
            testArr.add(arr[i]);
            if(testArr.indexOf(arr[i]) != i ){
                return  true ;
            }

        }
        return false ;
    }

    /**
     *
     * @param arr
     * @return average of the array elements
     */
    public static float calcAverage(int[] arr){
        float sum = 0 ;
        for(int value: arr){
            sum+=value ;
        }
        return  sum / arr.length ;
    }

    /**
     *
     * @param 2DArr
     * @return the lowest average in the array
     */
    public static float lowestAvg2DArr(int[][] arr){
        float sum = 0 ;
        float lowestAvg = 10000;
        for(int row = 0 ; row < arr.length ; row++){
            sum = 0 ;
            for (int col = 0 ; col < arr[row].length ; col++){
                sum+=arr[row][col];
            }
            if((sum / arr[row].length) < lowestAvg){
                lowestAvg = sum / arr[row].length ;
            }
        }
        return  lowestAvg ;
    }

    /**
     *
     * @param arr of weather temperature
     * @return highs and lowes weather and what degree does not happened
     */
    public static int analizeWeatherData(int[][] arr){
        Set<Integer> tempertchurRow = new HashSet<>();
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++){
                tempertchurRow.add(arr[row][col]);
            }
        }

        System.out.println("High: "
                + Collections.max(tempertchurRow));
        System.out.println("Low: "
                + Collections.min(tempertchurRow));

        for(int i=Collections.min(tempertchurRow);i<Collections.max(tempertchurRow);i++){
            if(tempertchurRow.contains(i)){
                continue;

            }else {
                System.out.println("Never Saw tempreture: " +i );
            }

        }
        return 0;
    }
    /**
     *
     * @param votes
     * @return the most votes repeated
     */
    public static String tally (ArrayList<String> votes){
        Map<String, Integer> wordMap = new HashMap<>();

        for (String st : votes) {
            String input = st.toUpperCase();
            if (wordMap.get(input) != null) {
                Integer count = wordMap.get(input) + 1;
                wordMap.put(input, count);


                //=
            } else {
                wordMap.put(input, 1);
            }
        }
//    System.out.println(wordMap);
        Object maxEntry = Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getKey();
//    System.out.println("maxEntry = " + maxEntry);
        return (String) maxEntry;
    }


}

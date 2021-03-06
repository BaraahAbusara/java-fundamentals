/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class App {

    public static int[] roll(int n) {
        int[] ansArr=new int[n];
        for(int i=0;i<n;i++)
        {
            Random random = new Random();
            int minRange = 1, maxRange= 7;
            int value = random.nextInt(maxRange - minRange) + minRange;
            ansArr[i]=value;
        }
        return ansArr;
    }

    public static boolean containsDuplicates(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
             for(int num=i+1;num<arr.length;num++)
            {
                if(arr[i]==arr[num])
                    return true;
            }

        }
        return false;
    }
    public static double calculatingAverages(int[] arr){
        double sum =0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        double average = sum/arr.length;
        return average;
    }
    public static int[] arraysOfArrays(int[][] arr){
        int ansArr[]=new int[arr[0].length];

        double mnAvg=1000000;

        double curAvg=-1;

        for(int i=0;i<arr.length;i++){
            curAvg = calculatingAverages(arr[i]);
            if(mnAvg>curAvg){
                mnAvg=curAvg;
               ansArr=arr[i];
            }

        }
        return ansArr;
    }
    public static String analyzingWeatherData(int[][] data){
        int mnValue=1000000,mxValue=-1;
        HashSet<Integer> dataSet = new HashSet<>();
        String answerStr ="";

        for(int i=0;i<data.length;i++)
        {
            for(int j=0;j<data[i].length;j++)
            {
                dataSet.add(data[i][j]);
                if(mnValue>data[i][j])
                {
                    mnValue=data[i][j];
                }
                if(mxValue<data[i][j])
                {
                    mxValue=data[i][j];
                }

            }
        }
        String answer="";

        answerStr+="High: "+mxValue+"\n";
        answerStr+="Low: "+mnValue+"\n";

        for (int i = mnValue; i <=mxValue ; i++) {
            if(!dataSet.contains(i))
            {
                answer="Never saw temperature: "+i+"\n";
                answerStr+=(answer);

            }
        }
        return answerStr;
    }
    public static String tally(ArrayList<String> arr)
    {
        int maxVotes=0;
        String winnerName="";
        Map <String , Integer> votes= new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if(votes.containsKey(arr.get(i)))
            {
                votes.put(arr.get(i),votes.get(arr.get(i))+1);
                if(votes.get(arr.get(i))>maxVotes)
                {
                    maxVotes=votes.get(arr.get(i));
                    winnerName=arr.get(i);
                }
             }
            else
            {
                votes.put(arr.get(i),0);
            }
      }
        return winnerName;
    }
    public static void main(String[] args) {


    }
}

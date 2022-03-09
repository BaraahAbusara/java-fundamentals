
package linter;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static boolean checkLine(String lines,int lineNumber)
    {
        if(lines==null || lines.length()==0)
            return false;
        else
        {

            if(lines.endsWith(";") ||lines.endsWith("}")||lines.endsWith("{")|| lines.contains("if")||lines.contains("else")){
                return false;
            }
            else{
                return true;
            }
        }




    }
    public static ArrayList <String> callLines(File file)
    {

        ArrayList <String> answerArray= new ArrayList<>() ;
        try (Scanner scanner = new Scanner(file)) {
            int lineNumber=1;
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if(checkLine(currentLine,lineNumber))
                {
                    answerArray.add("Line "+lineNumber+": Missing semicolon.");
                }
                lineNumber++;
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("From catch");
            System.err.println(fileNotFoundException.getMessage());
        }
        return answerArray;

    }



        public static void main(String[] args)  {
            String path = "app/src/test/resources/oneError.js";
            File file = new File(path);
            System.out.println(callLines(file));
        }

    //callLines function created by help of the instructor's code


}

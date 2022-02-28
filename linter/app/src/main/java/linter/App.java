
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

            if(lines.contains(";") || lines.contains("}")||lines.contains("{")|| lines.contains("if")||lines.contains("else")){
                return false;
            }
            else{
                return true;
            }
        }




    }
    public static ArrayList <String> callLines(String path)
    {

        File file = new File(path);
        ArrayList <String> answerArray= new ArrayList<>() ;
        try (Scanner scanner = new Scanner(file)) {
            int lineNumber=1;
            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
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
            System.out.println(callLines(path));
        }

    //callLines function created by help of the instructor's code


}

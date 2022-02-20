
import java.lang.String;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

class Main {
    public static void main (String[] args){

       System.out.println(pluralize("cat",3)) ;
       flipNHeads (3);
       clock();
    }

    public static String pluralize (String str, int num)
    {
        if (num ==0||num>1 )
            return str+"s";
        else
            return str ;
    }

    public static void flipNHeads (int n)
    {
        Random random = new Random();
        int counter=0 , flips=0;
        while(counter<n)
        {
            double randomNum = random.nextDouble();
            if(randomNum<0.5)
            {
                System.out.println("tails");
                flips++;
            }
            else
            {
                System.out.println("heads");
                counter++;
                flips++;
            }
        }
        System.out.println("It took "+flips+" flips to flip "+n+" head in a row.");
    }

    public static void clock ()
    {
        String formatPreviousDateTime =" ";
        double count =0.0  ;
        int Million = 1_000_000 ;
        while(true)
        {
            count++;
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formatDateTime = now.format(format);
            if(!(formatDateTime.equals(formatPreviousDateTime)))
            {
                System.out.println(formatDateTime+"   "+count/Million+" MHz" );
                formatPreviousDateTime=formatDateTime;
                count =0;
            }
        }
    }



}
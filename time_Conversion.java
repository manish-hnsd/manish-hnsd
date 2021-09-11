import java.util.Scanner;

public class time_Conversion {
    
    static String timeConversion(String s){
        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0,secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

        String newtimeINString = "";
        if((0<=hour && hour<12) && (period.equalsIgnoreCase("AM")){
            newtimeINString = String.format("%02d", hour) +":" + min + ":" + sec;
        } else if ((0 <= hour && hour <12) && period.equalsIgnoreCase("PM")) {
            newtimeINString = (12+hour) +":" + min + ":" + sec;

        } else if ((hour==12) && (period.equalsIgnoreCase("AM"))){
            newtimeINString = "00" + ":" + min +":" +sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newtimeINString = hour + ":" + min +":" +sec;
        }
        return newtimeINString; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String [] = time.split(":");
    }
}

import java.util.Scanner;

public class password_Strong 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String pass = sc.next();
        int missingChar = 0;
        String special = "!@#$%^&*()-+";
        boolean hasNum = false, hasLow = false, hasUpp = false, hasSpec = false;

        for(int i= 0; i<pass.length() && (!hasNum || !hasUpp || !hasLow || !hasSpec); i++)
        {
            if(!hasUpp)
                hasUpp = Character.isUpperCase(pass.charAt(i));
            if(!hasLow)
                hasLow = Character.isLowerCase(pass.charAt(i));
            if(!hasNum)
                hasNum = Character.isDigit(pass.charAt(i));
            if(!hasSpec && special.Character.indexOf(pass.charAt(i)) !=-1)
                hasSpec = true;
        }
        if(!hasNum) 
        missingChar++;
        if(!hasLow)
        missingChar++;
        if(!hasUpp)
        missingChar++;
        if(!hasSpec)
        missingChar++;

        if(pass.length() <= 6){
            if(6-pass.length() > missingChar)
            missingChar = 6-pass.length();

            return;
        }
    }
    
}

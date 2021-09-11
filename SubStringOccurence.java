public class SubStringOccurence 
{
    static int occurence(String text , String substring)
    {
        int count=0;
        int idx=0;
        //loop to check the substring count
        while((idx=text.indexOf(substring, idx)) != -1)
        {
            count++;
            idx++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        String text="canyoucan";
        String substring="can";

        //calling a  function
        System.out.println(occurence(text, substring));
        
    }
    
}

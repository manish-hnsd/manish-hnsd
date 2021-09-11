class Count_Frequency
{
    static int SIZE = 26;

    //function to print the character and its frequency in order of 
    //its occurence

    static void printCharWithFreq(String str)
    {
        int n= str.length();

        //'freq[]' implemented as hash table
        int[] freq = new int[SIZE];

        // accumulate frequency of each character in 'str'
        for(int i= 0; i<n; i++)
            freq[str.charAt(i) - 'a']++;

        //traverse 'str' from left to right
        for(int i= 0; i<n; i++)
        {
            // if frequency of character str.charAt(i) is not equal 
            //to 0
            if(freq[str.charAt(i) - 'a'] != 0)
            {
                // print the character along with its
                // frequency
                System.out.println("Occurence of "+str.charAt(i)+" is ");
                System.out.println(freq[str.charAt(i) - 'a']);

                // update frequency of str.charAt(i) to
                // 0 so that the same character is not printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }    
    }
    public static void main(String[] args) 
    {
        String str= "manishh";
        
        printCharWithFreq(str);
    }

}
class Occurence_of_Substring
{
    public static void main(String[] args) 
    {
        System.out.println("Number of Substring are :");
        //Scanner sc= new Scanner(System.in);
        String txt = "aAbcDefabcAdf";
        String sub = "abc";
        System.out.println(countFreq(txt,sub));
    }
    static int countFreq(String txt, String sub)
    {
        int M = txt.length();
        int N = sub.length();
        int res = 0;
        for(int i = 0;i<=M-N;i++)
        {
            int j;
            for(j=0;j<N;j++)
            {
                if(txt.charAt(i+j)!=sub.charAt(j))
                {
                    break;
                }
            }
            if(j == N)
            {
                res++;
                j=0;
            }
        }
        return res;
    }
    
}

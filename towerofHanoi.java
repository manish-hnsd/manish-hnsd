public class towerofHanoi {
    public static void main(String[] args) {
        int n = 4;
        tower(n, 'A', 'B', 'C');
    }
    static void tower(int n, char from, char aux, char to){
        if(n==1){
            System.out.println("Move Disk 1 from Rod "+from+" to rod "+to);
            return;
        }
        tower(n-1, from, to, aux);
        System.out.println("Move Disk "+ n +" from rod " +from+ " to rod "+to);
        tower(n-1, to, aux, from);
    }
}

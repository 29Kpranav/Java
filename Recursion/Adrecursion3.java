

// place tiles of size 1*m in a floor size of n*m

public class Adrecursion3 {
    public static int placeTiles(int n, int m){
        if(n ==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacements = placeTiles(n-m, m);

        //horizontally
        int horPlacements = placeTiles(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args){
        int n=3, m=3;
        System.out.println(placeTiles(n, m));
    }
}

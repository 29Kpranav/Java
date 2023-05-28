
// Print all permutations of a string
//abc --> 6 ways 

public class Adrecursion1 {
    public static void printPrem(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            //System.out.println(newStr);
            printPrem(newStr, permutation+currChar);               // for i=0; currChar=a, newStr=bc
        }
    }

    public static void main(String[] args){
    String str ="abc";
    printPrem(str, "");
    }
}

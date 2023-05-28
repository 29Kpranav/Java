public class leetcode3 {
    //Convert a Number to Hexadecimal
    static String toHex(int num) {
        String result;
        result=Integer.toHexString(num);  
        return result;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        toHex(num);
        String result="";
        System.out.println(result);
    }
}


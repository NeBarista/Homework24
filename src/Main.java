public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("http://"));
        System.out.println(checkString(""));
        System.out.println(checkString("a"));
    }
    public static boolean checkString(String number1) {
        if(number1.startsWith("http://")) {
            return true;
        }
        else{
            return false;
        }
    }
}
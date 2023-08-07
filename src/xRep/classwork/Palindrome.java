package xRep.classwork;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        sb1.reverse();

        if (sb2.toString().equals(sb1.toString())) {
            return true;
        }
        return false;
    }
}

class TestPalindrome {
    public static void main(String[] args) {
        String notPalindrome = "ggrrhrhe";
        String palindrome = "топот";
        System.out.println(Palindrome.isPalindrome(notPalindrome));
        System.out.println(Palindrome.isPalindrome(palindrome));

    }
}

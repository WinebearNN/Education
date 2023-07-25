package theory.article;

public class MethodsForStrings {
    public static void main(String[] args) {
//      If you need to find index of char or string in this string
        String str = "qwertyuiop";
        int k = str.indexOf("r");
//      System.out.println(k);

//      If you need to create an array which one will build from all string's char
        char[] charArray = str.toCharArray();
//      System.out.println(charArray[5]);

//      If you need to find a char and you have index
        int indexOfChar = 6;
//      System.out.println(str.charAt(indexOfChar));

//      If you need to append the passed string to the end of the given string
        String str1 = str.concat("tyty");
//      System.out.println(str1);

//      To replace all the occurrences of the given character/String from given string
        String str2 = " uy uytuytu uyt  ";
//      System.out.println(str2.replace(" ",""));

//      To get a part of a string from the given string
        int beginIndex = 2;
        int endIndex = 6;
//      System.out.println(str.substring(2,6));

//      For splitting the string base on the given regular expression
        String str3 = "qqwweewwttwwuu";
//      System.out.println(str3.split("ww",4)[3]);

//      To compare two Strings Lexicographically
        String str4 = "qqqrrrrrtt";
        String str5 = "qqqrrrrrtt";
//      System.out.println(str4.compareTo(str5));

//      To remove all trailing and leading whitespaces from the given string
        System.out.println(str2.strip());

    }
}


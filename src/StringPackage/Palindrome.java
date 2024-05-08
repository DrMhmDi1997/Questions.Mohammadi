package StringPackage;

public class Palindrome {

    public static void main(String[] args) {

        String word = "LEVEl";

        boolean flag = true;

        word = word.toLowerCase();

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }
}

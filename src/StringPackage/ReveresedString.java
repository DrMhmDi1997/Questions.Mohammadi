package StringPackage;

public class ReveresedString {

    public static void main(String[] args) {

        String sentence = "I am Mohammad Mohammadi";

        String reversedsentence = "";

        for (int i = sentence.length()-1; i >= 0; i--) {
reversedsentence = reversedsentence + sentence.charAt(i);
        }

        System.out.println(sentence);
        System.out.println(reversedsentence);
    }
}

package StringPackage;

public class VowCons {

    public static void main(String[] args) {

        int vowel = 0, consonant = 0;

        String sentence = "I am Dr. Mohammad Mohammadi";

        sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == i) {
                vowel++;
            } else if (sentence.charAt(i) > 'a' && sentence.charAt(i) <= 'z') {
                consonant++;

            }
        }

        System.out.println(vowel);
        System.out.println(consonant);
    }




    }


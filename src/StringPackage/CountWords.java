package StringPackage;

public class CountWords {

    public static void main(String[] args) {


        String sentence = "I am a talented boy";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                count ++;
            }
        }

        System.out.println(count);
    }

}

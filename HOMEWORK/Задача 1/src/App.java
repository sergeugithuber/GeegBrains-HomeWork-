public class App {
    public static void main(String[] args) throws Exception {
        String text1 = mergeAlternately("abc", "pqr");
        String text2 = mergeAlternately("ab", "pqrs");
        String text3 = mergeAlternately("abcd", "pq");
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }

    static String mergeAlternately(String word1, String word2) {
        String res = "";
        int max = 0; //Макс. длинное слово
        int start = 0; //старт с макс.длинн числа
        String max_word = "";

        if (word1.length() > word2.length()){
            max = word1.length();
            max_word = word1;
            start = 1;
        }
        else if (word1.length() == word2.length()) {
            max = word1.length();
            max_word = word1;
            start = 1;
        }
        else {
            max = word2.length();
            max_word = word2;
            start = 2;
        }

        for (int i = 0; i < max; i++ ){
            if (start == 1){
                if (i >= word2.length()){
                    res = res + word1.charAt(i);
                }
                else{
                    res = res + word1.charAt(i) + word2.charAt(i);
                }

            }
            if (start == 2){
                if (i >= word1.length()){
                    res = res + word2.charAt(i);
                }
                else{
                    res = res + word1.charAt(i) + word2.charAt(i);
                }
            }
        }
        return res;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        String word = "the sky is blue";
        System.out.println(reverseWords(word));
    }

    static String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder res = new StringBuilder(s.length());
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].length() != 0) {
                if (res.length() != 0) {
                    res.append(" ");
                }
                res.append(array[i]);
            }
        }
        return res.toString();
    }

}

























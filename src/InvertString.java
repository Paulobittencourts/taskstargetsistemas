public class InvertString {

    public static void main(String[] args) {
        String str = "Paulo";
        String newString = "";
        char[] characters = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        for (var i = str.length() - 1; i >= 0; i--) {
            newString += characters[i];
        }

        System.out.println("String original: " + str);
        System.out.println("String invert: " + newString);
    }
}

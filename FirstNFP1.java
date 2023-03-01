public class FirstNFP1 {
    public static void main(String[] args) {

        boolean word = lenghtchecker("fsssssssssssssssssssss ");
        System.out.println(word);
        boolean word2 = fancychecker("fancy ssssss  ");
        System.out.println(word2);
        boolean word3 = methodchecker(word, word2);
        System.out.println(word3);
    }

    public static boolean lenghtchecker(String word) {
        if (word.length() > 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean fancychecker(String word) {
        if (word.contains("fancy")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean methodchecker(boolean m1, boolean m2) {
        if ((m1 && m2) == true) {
            return true;
        } else {
            return false;
        }


    }
}
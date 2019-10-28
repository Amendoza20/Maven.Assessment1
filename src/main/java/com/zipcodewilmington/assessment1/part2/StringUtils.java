package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String index[] = sentence.split(" ", sentence.length());
        return index;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        //String index[] = sentence.split(" ",sentence.length());
        String[] index = getWords(sentence);
        return index[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] word = getWords(sentence);
        word[0] = getFirstWord(sentence);
        word[0] = reverse(word[0]);
        return word[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
       // String[] word = reverseFirstWord(sentence);
        String[] word = getWords(sentence);
        word[0] = getFirstWord(sentence);
        word[0] = reverse(word[0]);
        word[0] = camelCase(word[0]);
        return word[0];
    }


    /**
     * @param str   string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return null;
    }

    public static String reverse(String str) {
        String result = "";
        StringBuilder reverse = new StringBuilder();
        reverse.append(str);
        reverse.reverse();
        result = reverse.toString();
        return result;
    }

    public static String camelCase(String str) {
        String result = "";
        result = str.substring(0, 1).toUpperCase() + str.substring(1);

        return result;
    }
}




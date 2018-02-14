package com.ishan.graph;

import java.util.Scanner;

/**
 * This finds the length of the longest prefix which is also a suffix.
 * Assumption: Prefix and suffix do not overlap.
 * Example:
 * Input: aabcdaabc
 * Output: 4
 *
 * @author ishanjain
 * @since 14/02/18
 */
public class PrefixSuffix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String content = scanner.next();
            System.out.println(longestPrefixSuffix(content));
        }
    }

    /**
     * Approach:
     * 1) Reverse the string
     * 2) Compare start of first string and end of revered string till the characters match.
     *
     * @param content The original string
     * @return length of the longest prefix
     */
    private static int longestPrefixSuffix(String content) {
        if (content == null || content.length() == 0) {
            return 0;
        }
        char[] originalString = content.toCharArray();
        char[] reversedString = reverseString(originalString);
        int length = 0;
        int contentLength = content.length();
        for (int i = 0; i < contentLength; i++) {
            if (originalString[i] == reversedString[length - i]) {
                length++;
            } else {
                break;
            }
        }
        return length;
    }

    private static char[] reverseString(char[] content) {
        char[] reversedString = new char[content.length];
        int i = 0;
        for (char c : content) {
            reversedString[i++] = c;
        }
        return reversedString;
    }
}
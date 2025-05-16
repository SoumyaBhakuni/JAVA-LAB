import java.io.*;
import java.util.*;

public class PalindromeCounter {
    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("myfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Total Palindromes: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return word.equals(new StringBuilder(word).reverse().toString()) && word.length() > 1;
    }
}


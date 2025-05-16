public class WordExample {
    private String strdata;

    WordExample(String str) {
        int n = str.length();
        if (str.charAt(n - 1) != '.' && str.charAt(n - 1) != '?' && str.charAt(n - 1) != '!') {
            System.out.println("Your string must end with '.', '!', or '?'.\nIncorrect String input");
            strdata = "Empty";
        } else {
            strdata = str.toUpperCase();
        }
    }

    void countWord() {
        if (strdata.equals("Empty")) {
            System.out.println("No valid input string.");
            return;
        }

        String[] words = strdata.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                if (isVowel(firstChar) && isVowel(lastChar)) {
                    count++;
                }
            }
        }
        System.out.println("Count of words that start and end with vowels: " + count);
    }

     void placeWord() { 
        if (strdata.equals("Empty")) {
            System.out.println("No valid input string.");
            return;
        }

        String[] words = strdata.split("\\s+");
        StringBuilder startWithVowel = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                if (isVowel(firstChar) && isVowel(lastChar)) {
                    startWithVowel.append(word).append(" ");
                } else {
                    others.append(word).append(" ");
                }
            }
        }
        String result = startWithVowel.toString().trim() + " " + others.toString().trim();
        System.out.println(result);
    }


    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
    }

    public static void main(String[] args) {
        WordExample example = new WordExample("An apple is sweet.");
        example.countWord();
        example.placeWord();
    }
}


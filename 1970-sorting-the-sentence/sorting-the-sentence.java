class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for(String word : words) {
            int len = word.length();
            int index = word.charAt(len - 1) - '0';
            sortedWords[index - 1] = word.substring(0, len - 1);
        }

        return String.join(" ", sortedWords);
    }
}
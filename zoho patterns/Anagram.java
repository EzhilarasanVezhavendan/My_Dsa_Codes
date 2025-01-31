
class Anagram{
    public static boolean areAnagrams(String s1, String s2) {
        // Check if lengths are different
        if (s1.length() != s2.length()) return false;
        
        // Frequency array to count occurrences of each character
        int[] freq = new int[256]; // Assuming extended ASCII

        // Increment for characters in s1, decrement for characters in s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}

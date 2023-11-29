public class BeautifulSubstring1 {
    static int beautifulSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int vowel = 0, consonant = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
                        || s.charAt(j) == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
                if (vowel == consonant && (vowel * consonant) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abba";
        int k = 1;
        System.out.println(beautifulSubstrings(s, k));
    }
}

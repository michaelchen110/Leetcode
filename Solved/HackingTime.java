import java.util.*;

public class HackingTime {
	public static void main(String[] args) {
		HackingTime tester = new HackingTime();
		tester.unitTest();
	}
	public void unitTest() {
        String enc = "Bjj rwkcs dwpyp fwz ovors wxjs vje tcez fqg";
        System.out.println(decrypt(enc));
	}

    static String decrypt(String encrypted_message) {
        StringBuilder keys = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();
        String signature =  "Your friend, Alice";
        int sigLen = signature.length();
        int encLen = encrypted_message.length();

        for (int i = 0; i < sigLen; i++) {
            char m = encrypted_message.charAt(encLen - sigLen + i);
            char s = signature.charAt(i);
            if (Character.isLetter(m)) keys.append((26 + m - s) % 26);
        }

        String trueKey = LCSubstring(keys.toString());
        String key = "8251220";

        int idx = 0;
        for (int i = 0; i < encLen; i++) {
            char m = encrypted_message.charAt(i);
            char k = key.charAt(idx);
            if (Character.isLetter(m)) {
                char base = m < 'a' ? 'A' : 'a';
                decrypted.append((char) (base + (26 + (m - base) - (k - '0')) % 26));
                idx = (idx + 1) % key.length();
            }
            else {
                decrypted.append(m);
            }
        }
        return decrypted.toString();
    }

    static String LCSubstring(String keys){
        String reverse = new StringBuilder(keys).reverse().toString();
        String tmp = "";
        int right = 1;
        
        while (right < reverse.length()) {
            tmp = reverse.substring(0, right);
            int len = tmp.length();
            int left = right;
            while (left + len <= reverse.length()) {
                if (!tmp.equals(reverse.substring(left, left + len))) break;
                else left += len;
            }
            if (left + len <= reverse.length()) right++;
            else {
                int i = 0;
                while (left < reverse.length() && reverse.charAt(left) == tmp.charAt(i++)) left++;
                if (left < reverse.length()) right++;
                else break;
            }
        }
        return new StringBuilder(tmp).reverse().toString();
    }
}

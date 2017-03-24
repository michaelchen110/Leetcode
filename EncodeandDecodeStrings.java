import java.util.*;

public class EncodeandDecodeStrings {
	public static void main(String[] args) {
		EncodeandDecodeStrings tester = new EncodeandDecodeStrings();
		tester.unitTest();
	}
	public void unitTest() {
		List<String> list = new LinkedList<>();
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		/* list.add("aaaaaa"); */
		/* list.add("bbbb"); */
		/* list.add("ccccc"); */
		System.out.println(encode(list));
		/* decode(encode(list)); */
		/* for (String str : decode(encode(list))) System.out.println(str); */
	}
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str:strs) {
            sb.append(str.length()+":"+str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoder = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int len = -1;
        
        for (char ch: s.toCharArray()) {
            if (len == -1) {
                if (ch != ':') sb.append(ch);
                else {
                    len = Integer.parseInt(sb.toString());
					sb = new StringBuilder();
                }
            }
            else {
                if (--len > 0) sb.append(ch);
                else {
                    decoder.add(sb.toString());
					sb = new StringBuilder();
					len = -1;
                }
            }
        }
        return decoder;
    }
}

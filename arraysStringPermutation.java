import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class arraysStringPermutation {

	public static void main(String[] args) {
		
		String s1 = "permutation";
		String s2 = "mutaonper";
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		
		HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
		for( int i= 0 ; i < s1.length() ; i++) {
			Character ch = (Character)s1.charAt(i);
			Integer value = hashMap1.get(ch);
			if(value == null) {
				value = 0;
			}
			hashMap1.put(ch, value+1);
		}
		
		HashMap<Character, Integer> hashMap2 = new HashMap<Character, Integer>();
		for( int i= 0 ; i < s2.length() ; i++) {
			Character ch = (Character)s2.charAt(i);
			Integer value = hashMap2.get(ch);
			if(value == null) {
				value = 0;
			}
			hashMap2.put(ch, value+1);
		}
		
		boolean permutation = true;
		for(int i = 0; i < s1.length(); i++) {
			if(hashMap1.get(s1.charAt(i)) != hashMap2.get(s1.charAt(i))) {
				permutation = false;
				break;
			}
		}
		
		
		System.out.println(" Strings are permuations " + permutation);

	}

}

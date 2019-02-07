
public class palindromePermutation {

	public static void main(String[] args) {
		
		String data = "tactcoa";
		
		int len = data.length();
		
		int arrData[]  = new int[26];
		
		for(int i = 0; i<len; i++) {
			char ch = data.charAt(i);
			arrData[ch -'a'] = arrData[ch-'a'] + 1;
		}
		
		boolean single = false;
		boolean palindromePermutation = true;
		for(int i=0 ; i<26; i++) {
			if(arrData[i] %2 != 0 ) {
				if(!single) {
					single = true;
					palindromePermutation = true;
				} else {
					palindromePermutation = false;
					break;
				}
			} else {
				// no problem even
			}
		}
		System.out.println(" palindrome permutation ? " + palindromePermutation);
	}

}

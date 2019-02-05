import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class a1UniqueString {

	static String[] data = { "characters" , "uniqe}"};
	
	public static void main(String[] args) {
		
		
		boolean unique = checkUniqueHashMap();
		System.out.println(" String is "+ unique) ;
		
		
	}
	
	public static boolean checkUniqueHashMap() {
		
		HashMap<Character, Integer> hashMap =  new HashMap<>();
		int length = data[1].length();
		
		
		for(int i = 0 ; i < length; i++) {
			Integer count = hashMap.get(data[1].charAt(i));
			int cnt = 0;
			if(count == null) 
				cnt = 0; 
			else 
				cnt = count.intValue();
			hashMap.put(data[1].charAt(i), ++cnt);
		}
		
		boolean unique = true;
		Collection<Integer> countList = hashMap.values();
		Iterator<Integer> it = countList.iterator();
		while(it.hasNext()) {
			Integer data = it.next();
			if(data > 1) {
				unique = false;
				break;
			}
		}
		
		return unique;
	}

}

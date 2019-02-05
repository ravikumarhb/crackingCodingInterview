
public class arraysReplaceSpace {

	public static void main(String[] args) {
		String data = "Mr Ravi Kumar";
		int length = data.length();
		int spaces = 0;
		
		for(int i =0; i< length; i++) {
			if(data.charAt(i) == ' ') {
				spaces++;
			}
		}
		
		int j = data.length()-1;
		char[] destination = new char[length + spaces * 3];
		
		
		for(int i = destination.length-1 ; i>=0 ; i--) {
			if(data.charAt(j) != ' ') {
				destination[i] = data.charAt(j);
				j--;
			} else {
				destination[i--] = '0';
				destination[i--] = '2';
				destination[i--] = '%';
				j--;
			}
		}
		
		String finalString = new String(destination);
		System.out.println("Final String with %20 is "+ finalString);

	}

}

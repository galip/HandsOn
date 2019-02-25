import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String args[]) {
		
		String s = convertToBinaryNumber(9);
		System.out.println(s);
		
		String str[] = s.split("");
		
		List<String> stringList = new ArrayList<String>();
		stringList = Arrays.asList(str);
		
		
		int maxCount = findLongestDistanceBetweenOnes(stringList);
		System.out.println(maxCount);
		
	}
	
	public static String convertToBinaryNumber(int number) {
		int sonBasamak;
		StringBuffer sb = new StringBuffer();
		
		while(number > 1) {
			
			sonBasamak = number % 2;
			number = number / 2;
			sb.append(sonBasamak);
			if(number == 1) {
				sb.append(number);
			}
		}
		return sb.reverse().toString();
	}
	
	public static int findLongestDistanceBetweenOnes(List<String> stringList) {
		
		int length = stringList.size();
		int counter = 0;
		int maxCount = 0;
		
			int i = 0;
			while(length > i && length > 2) {
				if(!stringList.get(i).equals("1")) {
					counter++;
					
					
					if(counter > maxCount) {
						if(length > (i+1) && stringList.get(i+1).equals("1"))
						 maxCount = counter;
					}
				} else {
					counter = 0;
				}
				i++;
			}
			counter = 0;
		
		return maxCount;
	}
}
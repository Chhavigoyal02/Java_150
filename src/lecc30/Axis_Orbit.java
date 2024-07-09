package lecc30;
public class Axis_Orbit {
// Palindromic substrings leetcode 647 question
	public static void main(String[] args) {
		String s = "NitiN";
		System.out.println(PalindromicSubstrings(s));
	}

	public static int PalindromicSubstrings(String s) {
		// odd
		int odd = 0;
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt(axis -orbit)!= s.charAt(axis + orbit)) {
					break;
				}
				odd++;
			}
		}
		// even
		int even = 0;
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt((int)(axis - orbit))!= s.charAt((int)(axis + orbit))) {
					break;
				}
				even++;
			}
		}
		return odd+even;
	}
}

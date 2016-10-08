package com.practice0;

public class ParseDouble {
	public static double stringToDouble(String s) {

		boolean isNegative = false;
		int i;
		double result = 0.0f, result2 = 0.0f;
		if (s.charAt(0) == '-') {
			isNegative = true;
		}
		if (isNegative) {
			for (i=1; i < s.length(); i++)
				if (s.charAt(i) == '.')
					break;
				else
					result = result * 10 + (s.charAt(i) - '0');

			for (i = s.length() - 1; i >= 1; i--)
				if (s.charAt(i) == '.')
					break;
				else
					result2 = result2 / 10 + (s.charAt(i) - '0');
			if (i >= 1)
				result += result2 / 10;
			result = -result;
		}else{
				for (i = 0; i < s.length(); i++)
					if (s.charAt(i) == '.')
						break;
					else
						result = result * 10 + (s.charAt(i) - '0');

				for (i = s.length() - 1; i >= 0; i--)
					if (s.charAt(i) == '.')
						break;
					else
						result2 = result2 / 10 + (s.charAt(i) - '0');
				if (i >= 0)
					result += result2 / 10;
		}

//		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		String s = "-124023211.123";
		/*int i;
		double result = 0.0f, result2 = 0.0f;
		for (i = 0; i < s.length(); i++)
			if (s.charAt(i) == '.')
				break;
			else
				result = result * 10 + (s.charAt(i) - '0');

		for (i = s.length() - 1; i >= 0; i--)
			if (s.charAt(i) == '.')
				break;
			else
				result2 = result2 / 10 + (s.charAt(i) - '0');

		if (i >= 0)
			result += result2 / 10;*/
		System.out.println(stringToDouble(s));

	}
}

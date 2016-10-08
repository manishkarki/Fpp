package com.practice0;

public class Prog6 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			boolean found = false;
			for (int j = 0; j < i; j++) {
//				 System.out.println("args in i:"+args[i]+" "+"args in j:"+args[j]);
				if (args[i].equals(args[j])) {
					found = true;
				}

			}
			if (!found) {
				System.out.print(args[i] + " ");
			}

		}
	}

}

package org.alatin.timeDuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			TimeDuration duration = new TimeDuration(0);
			TimeDuration duration2 = new TimeDuration(732);
			System.out.println(duration);
			System.out.println(duration2);
		} catch (BadBadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}

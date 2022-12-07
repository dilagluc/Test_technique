package org.alatin.timeDuration;

public class TimeDuration {
	int numberSeconds;

	public TimeDuration(int numberSeconds) throws BadBadException {
		// super();
		if (numberSeconds < 0) {
			throw new BadBadException("No negative value");
		} else {
			this.numberSeconds = numberSeconds;
		}

	}

	@Override
	public String toString() {
		int sec = this.numberSeconds % 60;
		int inter = this.numberSeconds / 60;
		int min = inter % 60;
		int hours = inter / 60;

		String strSec = (sec < 10) ? "0" + Integer.toString(sec) : Integer.toString(sec);
		String strmin = (min < 10) ? "0" + Integer.toString(min) : Integer.toString(min);
		String strHours = (hours < 10) ? "0" + Integer.toString(hours) : Integer.toString(hours);
		// System.out.println(strHours + ":" + strmin + ":" + strSec);
		String retour = (hours == 0) ? (min == 0) ? strSec + "s" : strmin + "m " + strSec + "s"
				: strHours + "h " + strmin + "m " + strSec + "s";
		return retour;
	}

}

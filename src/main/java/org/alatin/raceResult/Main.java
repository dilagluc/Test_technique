package org.alatin.raceResult;

import org.alatin.timeDuration.BadBadException;
import org.alatin.timeDuration.TimeDuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TimeDuration duration1 = new TimeDuration(861);
			TimeDuration duration2 = new TimeDuration(732);
			TimeDuration duration3 = new TimeDuration(100);
			TimeDuration duration4 = new TimeDuration(300);
			TimeDuration duration5 = new TimeDuration(500);
			RaceResults raceResults = new RaceResults();
			raceResults.onNewResult("Player 1", duration1);
			raceResults.onNewResult("Player 2", duration2);
			raceResults.onNewResult("Player 3", duration3);
			raceResults.onNewResult("Player 4", duration4);
			raceResults.onNewResult("Player 5", duration5);
			raceResults.printResults();

			// I think that the thing which can go wrong is when two player arrived at the
			// same time, may be we should see a player name to sort them and the program i
			// wrote don't handle this
			// case

		} catch (BadBadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

	}

}

package org.alatin.raceResult;

import java.util.HashMap;

import org.alatin.timeDuration.TimeDuration;

public class RaceResults {
	HashMap<String, TimeDuration> tagMap;
	TimeDuration timeDuration;

	public RaceResults() {
		super();
		// this.event = event;
		this.tagMap = new HashMap<String, TimeDuration>();
	}

	void onNewResult(String tagNumber, TimeDuration resultTime) {
		tagMap.put(tagNumber, resultTime);
	}

	void printResults() {
		this.tagMap.entrySet().stream();
	}

}

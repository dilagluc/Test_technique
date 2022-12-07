package org.alatin.raceResult;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.alatin.timeDuration.TimeDuration;

public class RaceResults {
	private HashMap<String, TimeDuration> tagMap;

	public RaceResults() {
		super();
		// this.event = event;
		this.tagMap = new HashMap<String, TimeDuration>();
	}

	void onNewResult(String tagNumber, TimeDuration resultTime) {
		tagMap.put(tagNumber, resultTime);
	}

	void printResults() {
		// this.tagMap.values().stream( t -> );
		Comparator<TimeDuration> byTimeinSeconds = (TimeDuration obj1, TimeDuration obj2) -> Integer
				.valueOf(obj1.getNumberSeconds()).compareTo(Integer.valueOf(obj2.getNumberSeconds()));

		LinkedHashMap<String, TimeDuration> sortedMap = this.tagMap.entrySet().stream()
				.sorted(Map.Entry.<String, TimeDuration>comparingByValue(byTimeinSeconds))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		sortedMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		});
	}

}

package io.sparksync.compression;

import io.sparksync.compression.benchmark.stopwatch.impl.*;
import io.sparksync.compression.benchmark.stopwatch.IStopwatch;
import io.sparksync.compression.benchmark.stopwatch.StopwatchManager;
import lombok.Getter;

public class SparkyCompression {

	@Getter
	public static StopwatchManager stopwatchManager;
	
	private static IStopwatch stopwatch;

	public static void main(String[] args) throws InterruptedException {

		stopwatchManager = new StopwatchManager(new SimpleGuavaStopwatchProvider());
		
		stopwatch = stopwatchManager.getProvider();
		
		stopwatch.startStopwatch();
		
		//LOGIC
		
		stopwatch.stopStopwatch();
		
		System.out.println("That took '" + stopwatch.getResult() + "' " + stopwatch.getUnit());
	}
}

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

		stopwatchManager = new StopwatchManager(new SimpleNanoProvider());
		
		stopwatch = stopwatchManager.getProvider();
		
		int rounds = 10;
		
		for (int i = 1; i <= rounds; i++) {
			stopwatch.startStopwatch();
			
			Thread.sleep(500, 0);
			
			stopwatch.stopStopwatch();
			
			System.out.println("[" + i + "]" + " That took '" + stopwatch.getResult() + "' " + stopwatch.getUnit());
			
			stopwatchManager.getStatistics().addValue(stopwatch.getResult());
		}	
		
		System.out.println("[FINISHED] " + stopwatchManager.getStatistics().getMean());
	}
}

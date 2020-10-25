package io.sparksync.compression;

import io.sparksync.compression.benchmark.stopwatch.impl.*;

import java.util.UUID;

import io.sparksync.compression.benchmark.data.DataObject;
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
		
		//DATA OBJECT CREATION
		
		int objects = 10;
		
		System.out.println("[START] Generating '" + objects + "' DataObjects...");
		
		for (int i = 1; i <= objects; i++) {
			DataObject object = DataObject.getByUuid(UUID.randomUUID());
			
			System.out.println("[" + i + "]" + " Generated DataObject with the UUID '" + object.getUUID() + "'");
		}
		
		System.out.println("[FINISHED] '" + DataObject.getDataObjects().size() + "' DataObjects have been generated!");
		
		//STOPWATCH BENCHMARK
		
		int rounds = 10;
		
		System.out.println(" ");
		
		System.out.println("[START] Timing for '" + rounds + "' using " + stopwatchManager.getProvider().toString() + "...");
		
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

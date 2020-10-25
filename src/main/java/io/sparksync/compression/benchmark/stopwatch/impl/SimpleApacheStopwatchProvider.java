package io.sparksync.compression.benchmark.stopwatch.impl;

import org.apache.commons.lang3.time.StopWatch;

import io.sparksync.compression.benchmark.stopwatch.IStopwatch;

public class SimpleApacheStopwatchProvider implements IStopwatch {
	
	private StopWatch stopwatch;

	@Override
	public void startStopwatch() {
		stopwatch = new StopWatch();
		
		stopwatch.start();
	}

	@Override
	public void stopStopwatch() {
		stopwatch.stop();
	}

	@Override
	public long getResult() {
		return stopwatch.getTime();
	}

	@Override
	public String getUnit() {
		return "ms";
	}
}

package io.sparksync.compression.benchmark.stopwatch.impl;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

import io.sparksync.compression.benchmark.stopwatch.IStopwatch;

public class SimpleGuavaStopwatchProvider implements IStopwatch {
	
	private Stopwatch stopwatch;

	@Override
	public void startStopwatch() {
		stopwatch = Stopwatch.createStarted();
	}

	@Override
	public void stopStopwatch() {
		stopwatch.stop();
	}

	@Override
	public long getResult() {
		return stopwatch.elapsed(TimeUnit.NANOSECONDS);
	}

	@Override
	public String getUnit() {
		return "ns";
	}
}

package io.sparksync.compression.benchmark.stopwatch.impl;

import io.sparksync.compression.benchmark.stopwatch.IStopwatch;

public class SimpleNanoProvider implements IStopwatch {
	
	//WARNING: This is very inaccurate and was only included as an example.
	
	private long start, end;

	@Override
	public void startStopwatch() {
		start = System.nanoTime();
	}

	@Override
	public void stopStopwatch() {
		end = System.nanoTime();
		
	}

	@Override
	public long getResult() {
		return end - start;
	}

	@Override
	public String getUnit() {
		return "ns";
	}
}

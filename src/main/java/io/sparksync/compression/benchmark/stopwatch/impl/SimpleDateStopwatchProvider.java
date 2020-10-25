package io.sparksync.compression.benchmark.stopwatch.impl;

import java.util.Date;

import io.sparksync.compression.benchmark.stopwatch.IStopwatch;

public class SimpleDateStopwatchProvider implements IStopwatch {
	
	//WARNING: This is very inaccurate and was only included as an example.
	
	private long start, end;

	@Override
	public void startStopwatch() {
		start = new Date().getTime();
	}

	@Override
	public void stopStopwatch() {
		end = new Date().getTime();
		
	}

	@Override
	public long getResult() {
		return end - start;
	}

	@Override
	public String getUnit() {
		return "ms";
	}
}

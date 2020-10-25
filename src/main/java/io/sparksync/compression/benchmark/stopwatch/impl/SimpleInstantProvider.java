package io.sparksync.compression.benchmark.stopwatch.impl;

import java.time.Duration;
import java.time.Instant;

import io.sparksync.compression.benchmark.stopwatch.IStopwatch;

public class SimpleInstantProvider implements IStopwatch {
	
	Instant start, end;

	@Override
	public void startStopwatch() {
		start = Instant.now();
	}

	@Override
	public void stopStopwatch() {
		end = Instant.now();
		
	}

	@Override
	public long getResult() {
		return Duration.between(start, end).toNanos();
	}

	@Override
	public String getUnit() {
		return "ns";
	}
}

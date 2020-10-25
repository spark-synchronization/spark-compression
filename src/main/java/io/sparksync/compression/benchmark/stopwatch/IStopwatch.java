package io.sparksync.compression.benchmark.stopwatch;

public interface IStopwatch {
	
	void startStopwatch();
	
	void stopStopwatch();
	
	long getResult();
	
	String getUnit();
}

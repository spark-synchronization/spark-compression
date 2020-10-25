package io.sparksync.compression.benchmark.stopwatch;

public class StopwatchManager {
	
	public IStopwatch provider;
	
	public StopwatchManager(IStopwatch provider) {
		this.provider = provider;
	}
	
	public IStopwatch getProvider() {
		return provider;
	}
}

package io.sparksync.compression.benchmark.stopwatch;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class StopwatchManager {
	
	public IStopwatch provider;
	
	public DescriptiveStatistics statistics;
	
	public StopwatchManager(IStopwatch provider) {
		this.provider = provider;
		this.statistics = new DescriptiveStatistics();
	}
	
	public IStopwatch getProvider() {
		return provider;
	}
	
	public DescriptiveStatistics getStatistics() {
		return statistics;
	}
}

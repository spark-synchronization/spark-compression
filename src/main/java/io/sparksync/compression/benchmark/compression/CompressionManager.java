package io.sparksync.compression.benchmark.compression;

public class CompressionManager {
	
	public ICompression provider;
	
	public CompressionManager(ICompression provider) {
		this.provider = provider;
	}
	
	public ICompression getProvider() {
		return provider;
	}
}

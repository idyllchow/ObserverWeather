package com.idyll.duck;

public class Environment {
	BuildConfig bc;
	
	public void performConfig() {
		bc.envUrl();
	}
	
	public void setBuildConfig(BuildConfig buildConfig) {
		bc = buildConfig;
	}
}

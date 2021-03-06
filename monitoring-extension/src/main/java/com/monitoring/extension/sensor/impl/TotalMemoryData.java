package com.monitoring.extension.sensor.impl;

import com.monitoring.extension.sensor.AbstractResourceData;

public class TotalMemoryData extends AbstractResourceData<String>{

	private static final long serialVersionUID = -2267261076327722922L;
	private long totalMemory;
	
	public TotalMemoryData( final long totalMemory ) {
		this.totalMemory = totalMemory;
	}
	
	@Override
	public String getResourceName() {
		return "total-memory(mb)";
	}

	@Override
	public String getCurrentValue() {
		return totalMemory+" [("+totalMemory/1000+" kb), ("+totalMemory/1000000+" mb)]";
	}
}

package com.monitoring.extension.sensor.impl;

import com.monitoring.extension.domain.ResourceData;

public class RemainingMemorySensor extends AbstractResourceSensor<String> {

	@Override
	public final ResourceData<String> senseResourceDataInt() {
		System.gc();
		return new RemainingMemoryData(Runtime.getRuntime().freeMemory());
	}

}

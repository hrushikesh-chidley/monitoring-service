package com.gems.monitoring.rma.datastore.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.gems.monitoring.commons.domain.InstanceId;
import com.gems.monitoring.commons.domain.MonitoredData;
import com.gems.monitoring.rma.datastore.MonitoringDataStore;

public class InMemoryDataStore implements MonitoringDataStore {

	private Map<InstanceId, MonitoredData> dataStore = new HashMap<>(500);
	
	@Override
	public void storeMonitoringDataForInstance(final MonitoredData monitoredData) {
		dataStore.put(monitoredData.getInstanceId(), monitoredData);
	}

	@Override
	public MonitoredData retrieveMonitoringDataForInstance(final InstanceId instanceId) {
		final MonitoredData emptyData = new MonitoredData();
		emptyData.setInstanceId(instanceId);
		
		final MonitoredData data = dataStore.get(instanceId);
		return data == null ?  emptyData : data;
	}

	@Override
	public final Set<MonitoredData> retrieveCompleteMonitoringData() {
		final Set<MonitoredData> monitoredData = new HashSet<>(500);
		dataStore.keySet().forEach(instanceId -> monitoredData.add(dataStore.get(instanceId)));
		return monitoredData;
	}

}

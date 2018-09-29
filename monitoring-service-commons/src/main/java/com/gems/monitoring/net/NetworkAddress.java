package com.gems.monitoring.net;

import java.io.Serializable;

public final class NetworkAddress implements Serializable {
	
	private static final long serialVersionUID = -856301216024513413L;

	private final String ip;
	private final int port;

	public NetworkAddress(final String ip, final int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	
	public final String getIp() {
		return ip;
	}

	public final int getPort() {
		return port;
	}

}
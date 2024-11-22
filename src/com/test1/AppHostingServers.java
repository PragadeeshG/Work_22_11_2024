package com.test1;

public class AppHostingServers {
	private String appserverName;
	private String tomcatVersion;
	private String buildVersion;
	private String baseFolder;
	private String logFolder;
	private String providerName;
	private String logbackhandlers;
	private Integer appConfigcode;
	private String appConfigLocation;
	private String encryptionMode;
	private String serverPort;

	public AppHostingServers() {

	}

	public AppHostingServers(String appserverName, String tomcatVersion, String buildVersion, String baseFolder,
			String logFolder, String providerName, String logbackhandlers, Integer appConfigcode,
			String appConfigLocation, String encryptionMode, String serverPort) {
		super();
		this.appserverName = appserverName;
		this.tomcatVersion = tomcatVersion;
		this.buildVersion = buildVersion;
		this.baseFolder = baseFolder;
		this.logFolder = logFolder;
		this.providerName = providerName;
		this.logbackhandlers = logbackhandlers;
		this.appConfigcode = appConfigcode;
		this.appConfigLocation = appConfigLocation;
		this.encryptionMode = encryptionMode;
		this.serverPort = serverPort;
	}

	public String getAppserverName() {
		return appserverName;
	}

	public void setAppserverName(String appserverName) {
		this.appserverName = appserverName;
	}

	public String getTomcatVersion() {
		return tomcatVersion;
	}

	public void setTomcatVersion(String tomcatVersion) {
		this.tomcatVersion = tomcatVersion;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getBaseFolder() {
		return baseFolder;
	}

	public void setBaseFolder(String baseFolder) {
		this.baseFolder = baseFolder;
	}

	public String getLogFolder() {
		return logFolder;
	}

	public void setLogFolder(String logFolder) {
		this.logFolder = logFolder;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getLogbackhandlers() {
		return logbackhandlers;
	}

	public void setLogbackhandlers(String logbackhandlers) {
		this.logbackhandlers = logbackhandlers;
	}

	public Integer getAppConfigcode() {
		return appConfigcode;
	}

	public void setAppConfigcode(Integer appConfigcode) {
		this.appConfigcode = appConfigcode;
	}

	public String getAppConfigLocation() {
		return appConfigLocation;
	}

	public void setAppConfigLocation(String appConfigLocation) {
		this.appConfigLocation = appConfigLocation;
	}

	public String getEncryptionMode() {
		return encryptionMode;
	}

	public void setEncryptionMode(String encryptionMode) {
		this.encryptionMode = encryptionMode;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

}

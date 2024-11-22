package com.test1;

public class WebHostingServers {
	private String webAppName;
	private String webAppFolder;
	private boolean confFileAvailable;
	private Integer logFolderCount;
	private String logLocation;
	private String symLink;
	private Integer webserverCode;
	private Integer httpApacheCode;
	private String webserverPort;
	private Integer totalInstances;
	private String prodInstanceName;
	private String drInstanceName;
	private String sslConfiguration;

	public WebHostingServers() {

	}

	public WebHostingServers(String webAppName, String webAppFolder, boolean confFileAvailable, Integer logFolderCount,
			String logLocation, String symLink, Integer webserverCode, Integer httpApacheCode, String webserverPort,
			Integer totalInstances, String prodInstanceName, String drInstanceName, String sslConfiguration) {
		super();
		this.webAppName = webAppName;
		this.webAppFolder = webAppFolder;
		this.confFileAvailable = confFileAvailable;
		this.logFolderCount = logFolderCount;
		this.logLocation = logLocation;
		this.symLink = symLink;
		this.webserverCode = webserverCode;
		this.httpApacheCode = httpApacheCode;
		this.webserverPort = webserverPort;
		this.totalInstances = totalInstances;
		this.prodInstanceName = prodInstanceName;
		this.drInstanceName = drInstanceName;
		this.sslConfiguration = sslConfiguration;
	}

	public String getWebAppName() {
		return webAppName;
	}

	public void setWebAppName(String webAppName) {
		this.webAppName = webAppName;
	}

	public String getWebAppFolder() {
		return webAppFolder;
	}

	public void setWebAppFolder(String webAppFolder) {
		this.webAppFolder = webAppFolder;
	}

	public boolean isConfFileAvailable() {
		return confFileAvailable;
	}

	public void setConfFileAvailable(boolean confFileAvailable) {
		this.confFileAvailable = confFileAvailable;
	}

	public Integer getLogFolderCount() {
		return logFolderCount;
	}

	public void setLogFolderCount(Integer logFolderCount) {
		this.logFolderCount = logFolderCount;
	}

	public String getLogLocation() {
		return logLocation;
	}

	public void setLogLocation(String logLocation) {
		this.logLocation = logLocation;
	}

	public String getSymLink() {
		return symLink;
	}

	public void setSymLink(String symLink) {
		this.symLink = symLink;
	}

	public Integer getWebserverCode() {
		return webserverCode;
	}

	public void setWebserverCode(Integer webserverCode) {
		this.webserverCode = webserverCode;
	}

	public Integer getHttpApacheCode() {
		return httpApacheCode;
	}

	public void setHttpApacheCode(Integer httpApacheCode) {
		this.httpApacheCode = httpApacheCode;
	}

	public String getWebserverPort() {
		return webserverPort;
	}

	public void setWebserverPort(String webserverPort) {
		this.webserverPort = webserverPort;
	}

	public Integer getTotalInstances() {
		return totalInstances;
	}

	public void setTotalInstances(Integer totalInstances) {
		this.totalInstances = totalInstances;
	}

	public String getProdInstanceName() {
		return prodInstanceName;
	}

	public void setProdInstanceName(String prodInstanceName) {
		this.prodInstanceName = prodInstanceName;
	}

	public String getDrInstanceName() {
		return drInstanceName;
	}

	public void setDrInstanceName(String drInstanceName) {
		this.drInstanceName = drInstanceName;
	}

	public String getSslConfiguration() {
		return sslConfiguration;
	}

	public void setSslConfiguration(String sslConfiguration) {
		this.sslConfiguration = sslConfiguration;
	}

}

package com.test1;

public class HostingServers {
	private String serverHost;
	private String serverIp;
	private String sshKey;
	private String globalSSH;
	private String rootUser;
	private String appUser;
	private String gpgKey;
	private Integer gpgAlgo;
	private String baseFolder;
	private String patchDate;
	private String patchVersion;

	public HostingServers() {

	}

	public HostingServers(String serverHost, String serverIp, String sshKey, String globalSSH, String rootUser,
			String appUser, String gpgKey, Integer gpgAlgo, String baseFolder, String patchDate, String patchVersion) {
		super();
		this.serverHost = serverHost;
		this.serverIp = serverIp;
		this.sshKey = sshKey;
		this.globalSSH = globalSSH;
		this.rootUser = rootUser;
		this.appUser = appUser;
		this.gpgKey = gpgKey;
		this.gpgAlgo = gpgAlgo;
		this.baseFolder = baseFolder;
		this.patchDate = patchDate;
		this.patchVersion = patchVersion;
	}

	public String getServerHost() {
		return serverHost;
	}

	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getSshKey() {
		return sshKey;
	}

	public void setSshKey(String sshKey) {
		this.sshKey = sshKey;
	}

	public String getGlobalSSH() {
		return globalSSH;
	}

	public void setGlobalSSH(String globalSSH) {
		this.globalSSH = globalSSH;
	}

	public String getRootUser() {
		return rootUser;
	}

	public void setRootUser(String rootUser) {
		this.rootUser = rootUser;
	}

	public String getAppUser() {
		return appUser;
	}

	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}

	public String getGpgKey() {
		return gpgKey;
	}

	public void setGpgKey(String gpgKey) {
		this.gpgKey = gpgKey;
	}

	public Integer getGpgAlgo() {
		return gpgAlgo;
	}

	public void setGpgAlgo(Integer gpgAlgo) {
		this.gpgAlgo = gpgAlgo;
	}

	public String getBaseFolder() {
		return baseFolder;
	}

	public void setBaseFolder(String baseFolder) {
		this.baseFolder = baseFolder;
	}

	public String getPatchDate() {
		return patchDate;
	}

	public void setPatchDate(String patchDate) {
		this.patchDate = patchDate;
	}

	public String getPatchVersion() {
		return patchVersion;
	}

	public void setPatchVersion(String patchVersion) {
		this.patchVersion = patchVersion;
	}

}

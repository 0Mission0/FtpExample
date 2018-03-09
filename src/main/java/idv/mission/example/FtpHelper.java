package idv.mission.example;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;

public class FtpHelper extends FTPClient {

	private String host;
	private int port;
	private String username;
	private String password;
	
	public void login() throws IOException {
		System.out.println("Before Login");
		this.connect(host, port);
		this.login(username, password);
	}
	
	public void transfer() {
		System.out.println("Enter transfer");
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

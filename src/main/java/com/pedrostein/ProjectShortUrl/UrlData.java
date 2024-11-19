package com.pedrostein.ProjectShortUrl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UrlData {
	public UrlData(String originalUrl, long expirationTime) {
		this.originalUrl = originalUrl;
		this.expirationTime = expirationTime;
	}
	public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public long getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}
	private String originalUrl;
	private long expirationTime;
}

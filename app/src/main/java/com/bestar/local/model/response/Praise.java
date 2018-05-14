package com.bestar.local.model.response;

import java.io.Serializable;

public class Praise implements Serializable {
	private String faceimage;
	private String userId;
	private String nickname;
	public String getFaceimage() {
		return faceimage;
	}
	public void setFaceimage(String faceimage) {
		this.faceimage = faceimage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}

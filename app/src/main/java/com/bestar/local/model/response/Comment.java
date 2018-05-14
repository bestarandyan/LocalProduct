package com.bestar.local.model.response;

import java.io.Serializable;
import java.util.ArrayList;


public class Comment implements Serializable {
	private String content;
	private String createtime;
	private String faceimage;
	private String nickname;
	private String skillId;
	private String commentId;
	private String foundId;
	private String userId;
	private String toNickName;
	private String toId;
	private int wellOrPoor;
	private int type;
	private ArrayList<Image> image;
	private ArrayList<Image> commentimage;
	private ArrayList<Replay> reply_list;

	public int getWellOrPoor() {
		return wellOrPoor;
	}

	public void setWellOrPoor(int wellOrPoor) {
		this.wellOrPoor = wellOrPoor;
	}

	public ArrayList<Image> getCommentimage() {
		return commentimage;
	}
	public void setCommentimage(ArrayList<Image> commentimage) {
		this.commentimage = commentimage;
	}
	public String getToNickName() {
		return toNickName;
	}
	public void setToNickName(String toNickName) {
		this.toNickName = toNickName;
	}
	public String getToId() {
		return toId;
	}
	public void setToId(String toId) {
		this.toId = toId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getFoundId() {
		return foundId;
	}
	public void setFoundId(String foundId) {
		this.foundId = foundId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<Replay> getReply_list() {
		return reply_list;
	}
	public void setReply_list(ArrayList<Replay> reply_list) {
		this.reply_list = reply_list;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getFaceimage() {
		return faceimage;
	}
	public void setFaceimage(String faceimage) {
		this.faceimage = faceimage;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSkillId() {
		return skillId;
	}
	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}
	public ArrayList<Image> getImage() {
		return image;
	}
	public void setImage(ArrayList<Image> image) {
		this.image = image;
	}
	
	private class Replay{
		private String ID;
		private String faceimage;
		private String nickname;
		private String towho;
		private String content;
		private String createtime;
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getFaceimage() {
			return faceimage;
		}
		public void setFaceimage(String faceimage) {
			this.faceimage = faceimage;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getTowho() {
			return towho;
		}
		public void setTowho(String towho) {
			this.towho = towho;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getCreatetime() {
			return createtime;
		}
		public void setCreatetime(String createtime) {
			this.createtime = createtime;
		}
		
		
	}
	
}
package com.bestar.local.model.response;

import java.io.Serializable;

public class Image implements Serializable {
	private String image;
	private String bigImage;
	public String rawImage;
	private String h5Url;

	public String getRawImage() {
		return rawImage;
	}

	public void setRawImage(String rawImage) {
		this.rawImage = rawImage;
	}

	public String getH5Url() {
		return h5Url;
	}

	public void setH5Url(String h5Url) {
		this.h5Url = h5Url;
	}

	public String getBigImage() {
		return bigImage;
	}

	public void setBigImage(String bigImage) {
		this.bigImage = bigImage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}

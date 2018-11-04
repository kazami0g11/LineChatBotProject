package com.example.line.vo;

public class ImageMessage extends BaseMessage {

	private String originalContentUrl;

	private String previewImageUrl;

	public ImageMessage(String originalContentUrl, String previewImageUrl) {
		super();
		this.originalContentUrl = originalContentUrl;
		this.previewImageUrl = previewImageUrl;
		setType("image");
	}

	public String getOriginalContentUrl() {
		return originalContentUrl;
	}

	public void setOriginalContentUrl(String originalContentUrl) {
		this.originalContentUrl = originalContentUrl;
	}

	public String getPreviewImageUrl() {
		return previewImageUrl;
	}

	public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

}

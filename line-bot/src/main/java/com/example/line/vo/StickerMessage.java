package com.example.line.vo;

public class StickerMessage extends BaseMessage {

	private String packageId;

	private String stickerId;

	public StickerMessage(String packageId, String stickerId) {
		super();
		this.packageId = packageId;
		this.stickerId = stickerId;
		setType("sticker");
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getStickerId() {
		return stickerId;
	}

	public void setStickerId(String stickerId) {
		this.stickerId = stickerId;
	}

}

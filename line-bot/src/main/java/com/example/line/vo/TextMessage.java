package com.example.line.vo;

public class TextMessage extends BaseMessage {

	private String text;

	public TextMessage(String text) {
		super();
		this.text = text;
		setType("text");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

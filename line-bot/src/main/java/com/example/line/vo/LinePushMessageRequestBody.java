package com.example.line.vo;

import java.util.List;

public class LinePushMessageRequestBody {

	private String to;

	private List<BaseMessage> messages;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public List<BaseMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<BaseMessage> messages) {
		this.messages = messages;
	}

}

package com.example.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.line.vo.BaseMessage;
import com.example.line.vo.LinePushMessageRequestBody;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class LinePushMessageUtil {

	public void pushMessage(String channelAccessToken, List<BaseMessage> messages, String pushTarget) throws Exception {
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		headers.put("Authorization", "Bearer " + channelAccessToken);

		LinePushMessageRequestBody body = new LinePushMessageRequestBody();
		body.setTo(pushTarget);
		body.setMessages(messages);

		HttpResponse<String> response = Unirest.post("https://api.line.me/v2/bot/message/push").headers(headers)
				.body(new Gson().toJson(body)).asString();
	}

}

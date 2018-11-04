package com.example.linebot;

import java.util.ArrayList;
import java.util.List;

import com.example.line.vo.*;
import com.example.util.LinePushMessageUtil;

public class TestLinePushMessage {

	public static void main(String[] args) {
		String channelAccessToken = "rSkohgajCd7u8KEJc7/3m2Wh1045LI6YsCbzAm8lzu8EmCjrWz5ANay2qzNMBg3ftwjYhpoUBNii/5VevNXfHhFcbjTD4yXtWP6WvJ+ycLgtvoy2I5vhYKn1Fm+N5UQyymiPDIL31udae5GDu3RNLAdB04t89/1O/w1cDnyilFU=";

		String pushTarget = "Cb46660d804d5d1a82078274cb171531c";

		List<BaseMessage> messages = new ArrayList<>();

		TextMessage message1 = new TextMessage("澳門首家線上賭場上線啦");

		TextMessage message2 = new TextMessage("今天天氣東京熱");

		StickerMessage message3 = new StickerMessage("1", "1");

		LocationMessage message4 = new LocationMessage("富爾特科技股份有限公司", "my location", 24.978497, 121.544310);

		ImageMessage message5 = new ImageMessage("https://www.putnamlib.org/images/google.jpg",
				"https://www.putnamlib.org/images/google.jpg");

		messages.add(message1);
		messages.add(message2);
		messages.add(message3);
		messages.add(message4);
		messages.add(message5);

		LinePushMessageUtil util = new LinePushMessageUtil();
		try {
			util.pushMessage(channelAccessToken, messages, pushTarget);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

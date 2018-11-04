package com.example.linebot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.line.vo.Line;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@ResponseBody
public class TestController {
	
	@GetMapping("/test")
	public Map<String, String> test() {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		return map;
	}

	@PostMapping("/linebot/callback")
	public void getLineMessage(@RequestBody Line line) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(line));
	}

}

package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Marketer;
import com.example.demo.repository.MarketRepositor;

@SpringBootTest
class MarketingappApplicationTests {
	@Autowired
private MarketRepositor market;
	@Test
	void saveData() {
		Marketer m = new Marketer();
		m.setName("sanjay kumar nayak");
		m.setCourse("java");
		m.setFee(22000);
		market.save(m);
	}

}

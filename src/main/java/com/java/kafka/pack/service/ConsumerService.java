package com.java.kafka.pack.service;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.kafka.pack.model.OrderModel;

@Service
public class ConsumerService {

	
	@KafkaListener(topics = ConsumerAppConstants.KAFKA_TOPIC_ONE,groupId="jp-group-12")
	public void consumer1(String msg) {
		
		System.out.println("1>msg = "+msg);
	}
	
	@KafkaListener(topics = ConsumerAppConstants.KAFKA_TOPIC_ORDER,groupId="jp-group-order")
	public void orderDecodeConsumer(String encMsg) {
		ObjectMapper mapper= new ObjectMapper(); 
		Decoder dec = Base64.getDecoder();
		String decMsg = new String(dec.decode(encMsg));
		
		try {
			OrderModel obj = mapper.readValue(decMsg,OrderModel.class);	
			System.out.println("order received = "+obj);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

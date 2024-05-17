package com.java.kafka.pack.exception;

import lombok.Data;

@Data
public class ProductException extends Exception {
	private String expMsg;
}

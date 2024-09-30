package com.mysite.sbbmybatis;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	//DB에서 값을 가져오는것
	public String getMessage(Integer id) {
//		return messageMapper.getMessageById(id);
		return "Hello World~~";
	}
}

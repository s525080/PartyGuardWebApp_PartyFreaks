package com.nwmsu.srichaitanya.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.nwmsu.srichaitanya.messenger.model.Message;

public class MessengerService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L,"Hello World", "Srichaitanya");
		Message m2 = new Message(1L,"Hello Jersy", "Srichaitanya");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
} 

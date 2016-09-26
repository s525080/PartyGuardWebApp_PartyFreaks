package com.nwmsu.srichaitanya.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nwmsu.srichaitanya.messenger.model.Message;
import com.nwmsu.srichaitanya.messenger.service.MessengerService;

@Path("/messages")
public class MessageResources {
		@GET
		@Produces(MediaType.TEXT_XML)
		public List<Message> getMessage(){
		MessengerService ms = new MessengerService();
		return ms.getAllMessages();
		}
}


package com.pinyougou.page.service.impl;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pingyougou.page.service.ItemPageService;

@Component
public class ItemPageDeleteListener implements MessageListener{

	@Autowired
	private ItemPageService itemPageService; 
	
	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		ObjectMessage objectMessage = (ObjectMessage) message;
		try {
			Long []	goodsIds = (Long[]) objectMessage.getObject();
			System.out.println("接收到消息：" + goodsIds);
			boolean b = itemPageService.deleteItemHtml(goodsIds);
			System.out.println("删除网页：" + b);
			
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

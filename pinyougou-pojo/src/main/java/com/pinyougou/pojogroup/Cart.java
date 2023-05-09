package com.pinyougou.pojogroup;

import java.io.Serializable;
import java.util.List;

import javax.sound.sampled.LineListener;

import com.pinyougou.pojo.TbOrderItem;

/**
 * 购物车对象
 * @author Administrator
 *
 */
public class Cart implements Serializable{

	private String sellerId;
	private String sellerName;
	
	private List<TbOrderItem> orderItemList; // 购物车明细集合

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public List<TbOrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<TbOrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public Cart(String sellerId, String sellerName, List<TbOrderItem> orderItemList) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.orderItemList = orderItemList;
	}

	public Cart() {
		super();
	}
	
	
	
	
}

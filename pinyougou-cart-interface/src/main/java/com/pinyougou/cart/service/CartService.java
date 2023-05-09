package com.pinyougou.cart.service;

import java.util.List;

import com.pinyougou.pojogroup.Cart;

/**
 * 购物车服务接口
 * @author Administrator
 *
 */
public interface CartService {

	/**
	 * 添加商品到购物车
	 * @param list
	 * @param itemId
	 * @param num
	 * @return
	 */
	public List<Cart> addGoodsToCartList(List<Cart> CartList, Long itemId, Integer num);
	
	/**
	 * 从redis中提取购物车
	 * @param username
	 * @return
	 */
	public List<Cart> findCartListFromRedis(String username);

	/**
	 * 将购物车列表存入redis
	 * @param username
	 * @param CartList
	 */
	public void saveCartListToRedis(String username, List<Cart> cartList);
	
	/**
	 * 合并购物车
	 * @param cartList1
	 * @param cartList2
	 * @return
	 */
	public List<Cart> mergeCatList( List<Cart> cartList1,  List<Cart> cartList2);
}

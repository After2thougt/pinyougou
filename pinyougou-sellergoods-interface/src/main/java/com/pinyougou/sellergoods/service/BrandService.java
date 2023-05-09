package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;
import java.util.function.IntToDoubleFunction;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;


/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {
	
	public List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	/**
	 * 增加
	 * @param brand
	 */
	public void add(TbBrand brand);
	
	/**
	 * 根据ip查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 修改
	 * @param brand
	 */
	public void update(TbBrand brand);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Long[] ids);
	
	public PageResult findPage(TbBrand brand, int pageNum, int pageSize);
	
	/**
	 * 返回下拉列表数据
	 * @return
	 */
	public List<Map> selectOptionList();

}

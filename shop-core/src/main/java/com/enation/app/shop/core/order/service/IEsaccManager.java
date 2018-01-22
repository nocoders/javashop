package com.enation.app.shop.core.order.service;

import java.util.List;

import com.enation.app.shop.core.order.model.DlyArea;
import com.enation.app.shop.core.order.model.Esacc;
import com.enation.framework.database.Page;

public interface IEsaccManager {
	/**
	 * 添加资金
	 * @param name
	 */
	public void saveAdd(Esacc esacc);
	/**
	 * 修改资金
	 * @param area_id
	 * @param name
	 */
	public void saveEdit(Integer area_id,String name);

    /**
     * 删除资金
     * @param id
     */
	public void delete(String id);
	/**
	 * 根据会员资源列表
	 * @param member_id 会员ID
	 * @param page 分页
	 * @param pageSize 每页显示数量
	 * @return
	 */
	public Page list(Integer member_id,Integer page,Integer pageSize);
	
	/**
	 * 获取余额
	 * @param area_id
	 * @return
	 */
	public double getEsaccById(Integer member);
}

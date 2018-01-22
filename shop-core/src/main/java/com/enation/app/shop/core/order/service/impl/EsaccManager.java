package com.enation.app.shop.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enation.app.shop.core.order.model.Esacc;
import com.enation.app.shop.core.order.service.IEsaccManager;
import com.enation.framework.database.IDaoSupport;
import com.enation.framework.database.Page;
@Service("esaccManager")
public class EsaccManager implements IEsaccManager {
	@Autowired
	private IDaoSupport daoSupport;
	@Override
	public void saveAdd(Esacc esacc) {
		daoSupport.insert("es_acc", esacc);
	}

	@Override
	public void saveEdit(Integer area_id, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getEsaccById(Integer member) {
		 String sql = "SELECT IFNULL(SUM(bill_in), 0) - IFNULL(SUM(bill_out), 0) AS sumbalance FROM es_acc WHERE member_id=?";
		 double balance =this.daoSupport.queryForDouble(sql, member);
		 return balance;
	}

	@Override
	public Page list(Integer member_id, Integer page, Integer pageSize) {
		String sql = "select * from es_acc where member_id=? order by member_id desc ";
		Page webpage = this.daoSupport.queryForPage(sql, page, pageSize,member_id);
		return webpage;
	}

	

}

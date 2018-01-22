package com.enation.app.shop.front.tag.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enation.app.base.core.model.Member;
import com.enation.app.shop.core.order.service.IEsaccManager;
import com.enation.app.shop.core.order.service.ISellBackManager;
import com.enation.eop.sdk.context.UserConext;
import com.enation.framework.context.webcontext.ThreadContextHolder;
import com.enation.framework.database.Page;
import com.enation.framework.taglib.BaseFreeMarkerTag;

import freemarker.template.TemplateModelException;
@Component
public class AccBackListTag extends BaseFreeMarkerTag {
	@Autowired
	private IEsaccManager esaccManager;
	@Override
	protected Object exec(Map params) throws TemplateModelException {
		
		HttpServletRequest request = ThreadContextHolder.getHttpRequest();
		String page = request.getParameter("page");
		page=page==null?"1":page;
		Member member =  UserConext.getCurrentMember();
		int pageSize = 5;
		
		Page webpage=esaccManager.list(member.getMember_id(),Integer.parseInt(page), pageSize);
		Long totalCount = webpage.getTotalCount();

		Map result = new HashMap();
		List resultList = (List) webpage.getResult();
		resultList = resultList == null ? new ArrayList() : resultList;

		
		result.put("totalCount", totalCount);
		result.put("pageSize", pageSize);
		result.put("page", page);
		result.put("resultList", resultList);
		return result;
	}

}

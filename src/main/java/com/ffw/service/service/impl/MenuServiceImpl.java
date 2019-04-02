package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Menu;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<Menu> listMenu(PageData pd) throws Exception {
		return (List<Menu>) dao.findForList("MenuMapper.menulist", pd);
	}

	@Override
	public List<Menu> listRoleMenu(PageData pd) throws Exception {
		return (List<Menu>) dao.findForList("MenuMapper.menurolelist", pd);
	}

}

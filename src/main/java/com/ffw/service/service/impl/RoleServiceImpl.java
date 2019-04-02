package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("RoleMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMapper.listAll", pd);
	}

	@Override
	public List<PageData> listAllModule(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("RoleMapper.listAllModule", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("RoleMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("RoleMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("RoleMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("RoleMapper.findById", pd);
	}

}

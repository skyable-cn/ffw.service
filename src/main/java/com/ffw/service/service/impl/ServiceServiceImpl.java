package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IServiceService;

@Service
public class ServiceServiceImpl implements IServiceService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("ServiceMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ServiceMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("ServiceMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("ServiceMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("ServiceMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("ServiceMapper.findById", pd);
	}

}

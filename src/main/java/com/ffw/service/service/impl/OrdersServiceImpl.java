package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IOrdersService;

@Service
public class OrdersServiceImpl implements IOrdersService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("OrdersMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("OrdersMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("OrdersMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("OrdersMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("OrdersMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("OrdersMapper.findById", pd);
	}

	@Override
	public List<PageData> listAllPeople(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList(
				"OrdersitemMapper.listAllPeople", pd);
	}

}

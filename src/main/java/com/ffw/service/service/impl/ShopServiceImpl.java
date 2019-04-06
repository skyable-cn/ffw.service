package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IShopService;

@Service
public class ShopServiceImpl implements IShopService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("ShopMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ShopMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("ShopMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("ShopMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("ShopMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("ShopMapper.findById", pd);
	}

	@Override
	public List<PageData> listAllState(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ShopMapper.listAllState", pd);
	}

	@Override
	public void saveApprove(PageData pd) throws Exception {
		dao.save("ShopMapper.saveApprove", pd);
	}

	@Override
	public List<PageData> listAllApprove(PageData pd) throws Exception {
		return (List<PageData>) dao
				.findForList("ShopMapper.listAllApprove", pd);
	}

	@Override
	public List<PageData> listAllType(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("ShopMapper.listAllType", pd);
	}

}

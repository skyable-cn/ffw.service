package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.ILadderService;
import com.ffw.service.service.IStandService;

@Service
public class LadderServiceImpl implements ILadderService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("LadderMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("LadderMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("LadderMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("LadderMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("LadderMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("LadderMapper.findById", pd);
	}

}

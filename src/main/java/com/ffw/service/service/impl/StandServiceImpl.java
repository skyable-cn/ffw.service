package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IStandService;

@Service
public class StandServiceImpl implements IStandService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("StandMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("StandMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("StandMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("StandMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("StandMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("StandMapper.findById", pd);
	}

	@Override
	public List<PageData> listAllType(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("StandMapper.listAllType", pd);
	}

}

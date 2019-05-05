package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IPosterService;

@Service
public class PosterServiceImpl implements IPosterService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("PosterMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("PosterMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("PosterMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("PosterMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("PosterMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("PosterMapper.findById", pd);
	}

}

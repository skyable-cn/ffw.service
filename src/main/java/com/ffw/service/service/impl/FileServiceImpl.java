package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IFileService;

@Service
public class FileServiceImpl implements IFileService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("FileMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("FileMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("FileMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("FileMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("FileMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("FileMapper.findById", pd);
	}

	@Override
	public PageData findBy(PageData pd) throws Exception {
		return (PageData) dao.findForObject("FileMapper.findBy", pd);
	}

}

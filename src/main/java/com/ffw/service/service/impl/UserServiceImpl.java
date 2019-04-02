package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public PageData getUserInfo(PageData pd) throws Exception {
		return (PageData) dao.findForObject("UserMapper.getUserInfo", pd);
	}

	@Override
	public List<PageData> getUserList(PageData pageData) throws Exception {
		return (List<PageData>) dao.findForList("UserMapper.getUserInfo",
				pageData);
	}

	@Override
	public PageData findByUserName(PageData pd) throws Exception {
		return (PageData) dao.findForObject("UserMapper.findByUserName", pd);
	}

	@Override
	public PageData findByUserNameEditPhone(PageData pd) throws Exception {
		return (PageData) dao.findForObject(
				"UserMapper.findByUserNameEditPhone", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("UserMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.save("UserMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("UserMapper.edit", pd);
	}

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("UserMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("UserMapper.listAll", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("UserMapper.findById", pd);
	}

	@Override
	public PageData findByUserPhone(PageData pd) throws Exception {
		return (PageData) dao.findForObject("UserMapper.findByUserPhone", pd);
	}

	@Override
	public void editPassWord(PageData pd) throws Exception {
		dao.update("UserMapper.editPassWord", pd);
	}
}

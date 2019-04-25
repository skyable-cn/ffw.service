package com.ffw.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.dao.DaoSupport;
import com.ffw.service.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;

	@Override
	public List<PageData> listPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listPage", page);
	}

	@Override
	public List<PageData> listAll(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listAll", pd);
	}

	@Override
	public void save(PageData pd) throws Exception {
		dao.save("MemberMapper.save", pd);
	}

	@Override
	public void delete(PageData pd) throws Exception {
		dao.delete("MemberMapper.delete", pd);
	}

	@Override
	public void edit(PageData pd) throws Exception {
		dao.update("MemberMapper.edit", pd);
	}

	@Override
	public PageData findById(PageData pd) throws Exception {
		return (PageData) dao.findForObject("MemberMapper.findById", pd);
	}

	@Override
	public List<PageData> listAllType(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listAllType", pd);
	}

	@Override
	public PageData findBy(PageData pd) throws Exception {
		return (PageData) dao.findForObject("MemberMapper.findBy", pd);
	}

	@Override
	public List<PageData> listTeam(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listTeam", pd);
	}

	@Override
	public List<PageData> listCharges(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listCharges", pd);
	}

	@Override
	public List<PageData> listNumber(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listNumber", pd);
	}

	@Override
	public void saveAccount(PageData pd) throws Exception {
		dao.save("MemberMapper.saveAccount", pd);
	}

	@Override
	public PageData findIncome(PageData pd) throws Exception {
		return (PageData) dao.findForObject("MemberMapper.findIncome", pd);
	}

	@Override
	public List<PageData> listIncome(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listIncome", pd);
	}

	@Override
	public List<PageData> listPageIncome(Page page) throws Exception {
		return (List<PageData>) dao.findForList("MemberMapper.listPageIncome",
				page);
	}

}

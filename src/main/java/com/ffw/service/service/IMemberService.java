package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;

public interface IMemberService {

	void save(PageData pd) throws Exception;

	void delete(PageData pd) throws Exception;

	void edit(PageData pd) throws Exception;

	PageData findById(PageData pd) throws Exception;

	List<PageData> listPage(Page page) throws Exception;

	List<PageData> listAll(PageData pd) throws Exception;

	List<PageData> listAllType(PageData pd) throws Exception;

	PageData findBy(PageData pd) throws Exception;

	List<PageData> listTeam(PageData pd) throws Exception;

	List<PageData> listCharges(PageData pd) throws Exception;

	List<PageData> listNumber(PageData pd) throws Exception;

	void saveAccount(PageData pd) throws Exception;

	PageData findIncome(PageData pd) throws Exception;

	List<PageData> listIncome(PageData pd) throws Exception;

	List<PageData> listPageIncome(Page page) throws Exception;

}

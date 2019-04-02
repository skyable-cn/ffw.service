package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;

public interface IUserService {

	PageData getUserInfo(PageData pd) throws Exception;

	List<PageData> getUserList(PageData pageData) throws Exception;

	PageData findByUserName(PageData pd) throws Exception;

	void save(PageData pd) throws Exception;

	void delete(PageData pd) throws Exception;

	void edit(PageData pd) throws Exception;

	List<PageData> listPage(Page page) throws Exception;

	List<PageData> listAll(PageData pd) throws Exception;

	PageData findById(PageData pd) throws Exception;

	PageData findByUserPhone(PageData pd) throws Exception;

	void editPassWord(PageData pd) throws Exception;

	public PageData findByUserNameEditPhone(PageData pd) throws Exception;
}

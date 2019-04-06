package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;

public interface IShopService {

	void save(PageData pd) throws Exception;

	void delete(PageData pd) throws Exception;

	void edit(PageData pd) throws Exception;

	PageData findById(PageData pd) throws Exception;

	List<PageData> listPage(Page page) throws Exception;

	List<PageData> listAll(PageData pd) throws Exception;

	List<PageData> listAllState(PageData pd) throws Exception;

	void saveApprove(PageData pd) throws Exception;

	List<PageData> listAllApprove(PageData pd) throws Exception;

	List<PageData> listAllType(PageData pd) throws Exception;
}

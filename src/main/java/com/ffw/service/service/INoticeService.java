package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;

public interface INoticeService {

	void save(PageData pd) throws Exception;

	void delete(PageData pd) throws Exception;

	void edit(PageData pd) throws Exception;

	PageData findById(PageData pd) throws Exception;

	List<PageData> listPage(Page page) throws Exception;

	List<PageData> listAll(PageData pd) throws Exception;

	List<PageData> listAllUnRead(PageData pd) throws Exception;

	void saveRecord(PageData pd) throws Exception;

}

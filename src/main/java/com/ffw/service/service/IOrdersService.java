package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;

public interface IOrdersService {

	void save(PageData pd) throws Exception;

	void delete(PageData pd) throws Exception;

	void edit(PageData pd) throws Exception;

	PageData findById(PageData pd) throws Exception;

	List<PageData> listPage(Page page) throws Exception;

	List<PageData> listAll(PageData pd) throws Exception;

	List<PageData> listAllRefund(PageData pd) throws Exception;

	void saveRefund(PageData pd) throws Exception;

	PageData findBy(PageData pd) throws Exception;

	List<PageData> listPageBill(Page page) throws Exception;

	List<PageData> listPageShop(Page page) throws Exception;

	void saveRate(PageData pd) throws Exception;

}

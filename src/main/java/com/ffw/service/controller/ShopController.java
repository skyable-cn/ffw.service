package com.ffw.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ffw.api.model.Page;
import com.ffw.api.model.PageData;
import com.ffw.service.service.IShopService;

@RestController
@RequestMapping("shop")
public class ShopController extends BaseController {

	@Autowired
	IShopService shopService;

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<PageData> listAll(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = shopService.listAll(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listAllApprove", method = RequestMethod.POST)
	public List<PageData> listAllApprove(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = shopService.listAllApprove(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listAllState", method = RequestMethod.POST)
	public List<PageData> listAllState(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = shopService.listAllState(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listPage", method = RequestMethod.POST)
	public Page listPage(@RequestBody PageData pd) {
		Page page = getPage(pd);
		List<PageData> data = null;
		try {
			data = shopService.listPage(page);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		page.setData(data);
		return page;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public PageData save(@RequestBody PageData pd) {
		try {
			shopService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "saveApprove", method = RequestMethod.POST)
	public PageData saveApprove(@RequestBody PageData pd) {
		try {
			shopService.saveApprove(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public PageData edit(@RequestBody PageData pd) {
		try {
			shopService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public PageData delete(@RequestBody PageData pd) {
		try {
			shopService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public PageData find(@RequestBody PageData pd) {
		try {
			pd = shopService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}

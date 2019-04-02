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
import com.ffw.service.service.IUserService;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {

	@Autowired
	IUserService userService;

	@RequestMapping(value = "findByUserName", method = RequestMethod.POST)
	public PageData findByUserName(@RequestBody PageData pd) throws Exception {
		return userService.findByUserName(pd);
	}

	@RequestMapping(value = "listPage", method = RequestMethod.POST)
	public Page listPage(@RequestBody PageData pd) {
		Page page = getPage(pd);
		List<PageData> data = null;
		try {
			data = userService.listPage(page);
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
			userService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public PageData edit(@RequestBody PageData pd) {
		try {
			userService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public PageData delete(@RequestBody PageData pd) {
		try {
			userService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public PageData find(@RequestBody PageData pd) {
		try {
			pd = userService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findByName", method = RequestMethod.POST)
	public PageData findByName(@RequestBody PageData pd) {
		try {
			pd = userService.findByUserName(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}

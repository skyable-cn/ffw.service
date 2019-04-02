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
import com.ffw.service.service.IFileService;

@RestController
@RequestMapping("file")
public class FileController extends BaseController {

	@Autowired
	IFileService fileService;

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<PageData> listAll(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = fileService.listAll(pd);
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
			data = fileService.listPage(page);
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
			fileService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public PageData edit(@RequestBody PageData pd) {
		try {
			fileService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public PageData delete(@RequestBody PageData pd) {
		try {
			fileService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public PageData find(@RequestBody PageData pd) {
		try {
			pd = fileService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findBy", method = RequestMethod.POST)
	public PageData findBy(@RequestBody PageData pd) {
		try {
			pd = fileService.findBy(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}
}

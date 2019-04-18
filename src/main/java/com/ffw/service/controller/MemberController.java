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
import com.ffw.service.service.IMemberService;

@RestController
@RequestMapping("member")
public class MemberController extends BaseController {

	@Autowired
	IMemberService memberService;

	@RequestMapping(value = "listAllType", method = RequestMethod.POST)
	public List<PageData> listAllModule(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = memberService.listAllType(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<PageData> listAll(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = memberService.listAll(pd);
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
			data = memberService.listPage(page);
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
			memberService.save(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public PageData edit(@RequestBody PageData pd) {
		try {
			memberService.edit(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public PageData delete(@RequestBody PageData pd) {
		try {
			memberService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public PageData find(@RequestBody PageData pd) {
		try {
			pd = memberService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findBy", method = RequestMethod.POST)
	public PageData findBy(@RequestBody PageData pd) {
		try {
			pd = memberService.findBy(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "listTeam", method = RequestMethod.POST)
	public List<PageData> listTeam(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = memberService.listTeam(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listCharges", method = RequestMethod.POST)
	public List<PageData> listCharges(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = memberService.listCharges(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "listNumber", method = RequestMethod.POST)
	public List<PageData> listNumber(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = memberService.listNumber(pd);
		} catch (Exception e) {
			data = new ArrayList<PageData>();
			e.printStackTrace();
		}
		return data;
	}
}

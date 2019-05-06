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
import com.ffw.service.service.ICardsService;
import com.ffw.service.service.ICouponService;
import com.ffw.service.service.IVipinfoService;

@RestController
@RequestMapping("vipinfo")
public class VipinfoController extends BaseController {

	@Autowired
	IVipinfoService vipinfoService;

	@Autowired
	ICouponService couponService;

	@Autowired
	ICardsService cardsService;

	@RequestMapping(value = "listAll", method = RequestMethod.POST)
	public List<PageData> listAll(@RequestBody PageData pd) {
		List<PageData> data = null;
		try {
			data = vipinfoService.listAll(pd);
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
			data = vipinfoService.listPage(page);
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
			vipinfoService.save(pd);
			handler(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public PageData edit(@RequestBody PageData pd) {
		try {
			vipinfoService.edit(pd);
			handler(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public PageData delete(@RequestBody PageData pd) {
		try {
			vipinfoService.delete(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "find", method = RequestMethod.POST)
	public PageData find(@RequestBody PageData pd) {
		try {
			pd = vipinfoService.findById(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "findBy", method = RequestMethod.POST)
	public PageData findBy(@RequestBody PageData pd) {
		try {
			pd = vipinfoService.findBy(pd);
		} catch (Exception e) {
			pd = null;
			e.printStackTrace();
		}
		return pd;
	}

	public void handler(PageData pd) throws Exception {

		String MEMBER_ID = pd.getString("MEMBER_ID");

		PageData pd1 = new PageData();
		pd1.put("STATE", "1");
		List<PageData> couponData = couponService.listAll(pd1);

		for (PageData item : couponData) {
			PageData pd2 = new PageData();
			pd2.put("COUPON_ID", item.getString("COUPON_ID"));
			pd2.put("MEMBER_ID", MEMBER_ID);

			pd2 = cardsService.findBy(pd2);
			if (null == pd2) {
				PageData pd3 = new PageData();
				pd3.put("COUPON_ID", item.getString("COUPON_ID"));
				pd3.put("MEMBER_ID", MEMBER_ID);
				pd3.put("MONEY", item.getString("MONEY"));
				pd3.put("DESCRIPTION", item.getString("MONEY") + "现金券");
				pd3.put("STARTTIME", item.getString("STARTTIME"));
				pd3.put("ENDTIME", item.getString("ENDTIME"));
				pd3.put("STATE", "0");
				cardsService.save(pd3);
			}

		}
	}
}

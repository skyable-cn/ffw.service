package com.ffw.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ffw.api.model.Menu;
import com.ffw.api.model.PageData;
import com.ffw.service.service.IMenuService;

@RestController
@RequestMapping("menu")
public class MenuController {

	@Autowired
	IMenuService menuService;

	@RequestMapping(value = "listRoleMenu", method = RequestMethod.POST)
	public List<Menu> listRoleMenu(@RequestBody PageData pd) throws Exception {
		return menuService.listRoleMenu(pd);
	}
}

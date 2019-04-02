package com.ffw.service.service;

import java.util.List;

import com.ffw.api.model.Menu;
import com.ffw.api.model.PageData;

public interface IMenuService {

	List<Menu> listMenu(PageData pd) throws Exception;

	List<Menu> listRoleMenu(PageData pd) throws Exception;
}

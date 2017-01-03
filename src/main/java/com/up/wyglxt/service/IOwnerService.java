package com.up.wyglxt.service;

import java.util.List;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.entity.Owner;

public interface IOwnerService extends IBaseService {
	List<Owner> queryByPage(int currentPageNum);

	Owner loadByName(String name);

	Owner loadByHouseNo(String houseNo);
}

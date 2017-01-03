package com.up.wyglxt.service;

import java.util.List;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.entity.House;

public interface IHouseService extends IBaseService {
	List<House> queryByPage(int currentPageNum);

	House loadByNo(String houseNo);
}

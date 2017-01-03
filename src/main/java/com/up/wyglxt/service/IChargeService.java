package com.up.wyglxt.service;

import java.util.Date;
import java.util.List;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.entity.Charge;

public interface IChargeService extends IBaseService {
	List<Charge> queryByPage(int currentPageNum);

	Charge loadByHouseNo(String houseNo);

	Charge loadByHouseNoAndMonth(String houseNo, Date month);
}

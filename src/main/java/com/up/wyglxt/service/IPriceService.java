package com.up.wyglxt.service;

import java.util.Date;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.entity.Price;

public interface IPriceService extends IBaseService {
	public Price loadByMonth(Date month);
}

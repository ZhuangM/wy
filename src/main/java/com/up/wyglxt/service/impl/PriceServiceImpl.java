package com.up.wyglxt.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import com.up.wyglxt.base.BaseServiceImpl;
import com.up.wyglxt.dao.PriceDAO;
import com.up.wyglxt.entity.Price;
import com.up.wyglxt.service.IPriceService;

public class PriceServiceImpl extends BaseServiceImpl implements IPriceService {
	@Resource(name = "priceDAO")
	PriceDAO priceDAO;

	public PriceServiceImpl() {
		super();
	}

	@Override
	protected void buildAbilityDao() {
		if (!daoList.contains(priceDAO)) {
			daoList.add(priceDAO);
		}
	}

	@Override
	public Price loadByMonth(Date month) {
		Price price = null;
		if (null == month) {
			return price;
		}
		PriceDAO priceDAO = (PriceDAO) findAbilityDAO(Price.class);
		if (null == priceDAO) {
			return price;
		}
		price = priceDAO.loadByMonth(month);
		return price;
	}

}

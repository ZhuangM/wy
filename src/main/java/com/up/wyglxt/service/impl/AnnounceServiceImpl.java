package com.up.wyglxt.service.impl;

import javax.annotation.Resource;

import com.up.wyglxt.base.BaseServiceImpl;
import com.up.wyglxt.dao.AnnounceDAO;
import com.up.wyglxt.service.IAnnounceService;

public class AnnounceServiceImpl extends BaseServiceImpl implements IAnnounceService {
	@Resource(name = "announceDAO")
	AnnounceDAO announceDAO;

	public AnnounceServiceImpl() {
		super();
	}

	@Override
	protected void buildAbilityDao() {
		if (!daoList.contains(announceDAO)) {
			daoList.add(announceDAO);
		}
	}

}

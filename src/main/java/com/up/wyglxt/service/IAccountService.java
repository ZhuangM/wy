package com.up.wyglxt.service;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.entity.Account;

public interface IAccountService extends IBaseService {

	Account login(String username, String password, String role);

	boolean deleteByHouseNo(String houseNo);

}

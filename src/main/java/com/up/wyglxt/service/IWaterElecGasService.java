package com.up.wyglxt.service;

import java.util.Date;
import java.util.List;

import com.up.wyglxt.base.IBaseService;
import com.up.wyglxt.dto.WaterElecGasDTO;
import com.up.wyglxt.entity.WaterElecGas;

public interface IWaterElecGasService extends IBaseService {
	WaterElecGas loadByMonthAndHouseNo(Date month, String houseNo);

	List<WaterElecGasDTO> loadForReport(String year);
}

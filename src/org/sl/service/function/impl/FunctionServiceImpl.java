package org.sl.service.function.impl;

import java.util.List;

import javax.annotation.Resource;

import org.sl.dao.function.FunctionMapper;
import org.sl.pojo.Function;
import org.sl.pojo.QuanXian;
import org.sl.service.function.FunctionService;
import org.springframework.stereotype.Service;

@Service
public class FunctionServiceImpl implements FunctionService {
	
	@Resource
	private FunctionMapper functionMapper;
	
	@Override
	public List<Function> getZhuCaiDan(QuanXian quanXian) throws Exception {
		// TODO Auto-generated method stub
		return functionMapper.getZhuCaiDan(quanXian);
	}

	@Override
	public List<Function> getZiCaiDan(Function function) throws Exception {
		// TODO Auto-generated method stub
		return functionMapper.getZiCaiDan(function);
	}

	@Override
	public List<Function> getZhuFuncList(Function function) throws Exception {
		// TODO Auto-generated method stub
		return functionMapper.getZhuFuncList(function);
	}

	@Override
	public List<Function> getFunctionListByRoId(QuanXian quanXian)
			throws Exception {
		// TODO Auto-generated method stub
		return functionMapper.getFunctionListByRoId(quanXian);
	}

	@Override
	public List<Function> getFunctionListByIn(String sqlInString)
			throws Exception {
		// TODO Auto-generated method stub
		return functionMapper.getFunctionListByIn(sqlInString);
	}

}

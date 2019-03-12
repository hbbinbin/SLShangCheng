package org.sl.service.huifu.impl;

import java.util.List;

import javax.annotation.Resource;

import org.sl.dao.huifu.HuiFuMapper;
import org.sl.pojo.HuiFu;
import org.sl.service.huifu.HuiFuService;
import org.springframework.stereotype.Controller;

@Controller
public class HuiFuServiceImpl implements HuiFuService {
	
	@Resource
	private HuiFuMapper huiFuMapper;
	
	@Override
	public List<HuiFu> getHuiFuList(HuiFu huiFu) throws Exception {
		// TODO Auto-generated method stub
		return huiFuMapper.getHuiFuList(huiFu);
	}

	@Override
	public int getCount(HuiFu huiFu) throws Exception {
		// TODO Auto-generated method stub
		return huiFuMapper.getCount(huiFu);
	}

	@Override
	public int deleteHuiFu(HuiFu huiFu) throws Exception {
		// TODO Auto-generated method stub
		return huiFuMapper.deleteHuiFu(huiFu);
	}

	@Override
	public int addHuiFu(HuiFu huiFu) throws Exception {
		// TODO Auto-generated method stub
		return huiFuMapper.addHuiFu(huiFu);
	}

}

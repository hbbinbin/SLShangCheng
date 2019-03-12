package org.sl.service.liuyan.impl;

import java.util.List;

import javax.annotation.Resource;

import org.sl.dao.liuyan.LiuYanMapper;
import org.sl.pojo.LiuYan;
import org.sl.service.liuyan.LiuYanService;
import org.springframework.stereotype.Service;

@Service
public class LiuYanServiceImpl implements LiuYanService {
	
	@Resource
	private LiuYanMapper liuYanMapper;
	
	@Override
	public List<LiuYan> getLiuYanList(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.getLiuYanList(liuYan);
	}

	@Override
	public int getCount(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.getCount(liuYan);
	}

	@Override
	public int addLiuYan(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.addLiuYan(liuYan);
	}

	@Override
	public int updateLiuYan(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.updateLiuYan(liuYan);
	}

	@Override
	public int deleteLiuYan(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.deleteLiuYan(liuYan);
	}

	@Override
	public LiuYan getLiuYanById(LiuYan liuYan) throws Exception {
		// TODO Auto-generated method stub
		return liuYanMapper.getLiuYanById(liuYan);
	}

}

package org.sl.service.uploadtemp.impl;

import java.util.List;

import javax.annotation.Resource;

import org.sl.dao.uploadtemp.UploadTempMapper;
import org.sl.pojo.UploadTemp;
import org.sl.service.uploadtemp.UploadTempService;
import org.springframework.stereotype.Service;

@Service
public class UploadTempServiceImpl implements UploadTempService {

	@Resource
	private UploadTempMapper uploadTempMapper;
	
	@Override
	public List<UploadTemp> getList(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return uploadTempMapper.getList(uploadTemp);
	}

	@Override
	public int add(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return uploadTempMapper.add(uploadTemp);
	}

	@Override
	public int delete(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return uploadTempMapper.delete(uploadTemp);
	}

}

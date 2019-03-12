package org.sl.service.uploadtemp;

import java.util.List;

import org.sl.pojo.UploadTemp;

public interface UploadTempService {
	/**
	 * 获取文件路径集合
	 * @param uploadTemp
	 * @return
	 * @throws Exception
	 */
	public List<UploadTemp> getList(UploadTemp uploadTemp) throws Exception;
	/**
	 * 添加文件路径
	 * @param uploadTemp
	 * @return
	 * @throws Exception
	 */
	public int add(UploadTemp uploadTemp) throws Exception;
	/**
	 * 删除文件路径
	 * @param uploadTemp
	 * @return
	 * @throws Exception
	 */
	public int delete(UploadTemp uploadTemp) throws Exception;
}

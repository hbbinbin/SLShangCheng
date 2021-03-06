package org.sl.service.goodspack;

import java.util.List;

import org.sl.pojo.Goods;
import org.sl.pojo.GoodsPack;

public interface GoodsPackService {

	/**
	 * 获取商品套餐集合，根据最后更新时间降序分页显示
	 * @return
	 * @throws Exception
	 */
	public List<GoodsPack> getGoodsPackList(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 获取套餐表中最大的id
	 * @return
	 * @throws Exception
	 */
	public int getMaxId() throws Exception;
	
	/**
	 * 获取商品套餐数量
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public int count(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 根据id获取商品套餐
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public GoodsPack getGoodsPackById(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 根据商品套餐id获取套餐里的商品信息
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public List<Goods> getGoodsById(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 增加商品套餐
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public int addGoodsPack(GoodsPack goodsPack) throws Exception; 

	/**
	 * 添加关联表信息
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public int addGoodsPackLian(Goods goods) throws Exception;
	
	/**
	 * 添加商品套餐事务
	 * @param goodsPack
	 * @param goodsList
	 * @return
	 * @throws Exception
	 */
	public boolean hl_addGoodsPack(GoodsPack goodsPack,List<Goods> goodsList) throws Exception;
	
	/**
	 * 修改商品套餐事务
	 * @param goodsPack
	 * @param goodsList
	 * @return
	 * @throws Exception
	 */
	public boolean hl_updateGoodsPack(GoodsPack goodsPack,List<Goods> goodsList) throws Exception;
	
	/**
	 * 删除商品套餐事务
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public boolean hl_deleteGoodsPack(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 修改商品套餐
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public int updateGoodsPack(GoodsPack goodsPack) throws Exception;
	
	/**
	 * 删除商品套餐
	 * @param goodsPack
	 * @return
	 * @throws Exception
	 */
	public int deleteGoodsPack(GoodsPack goodsPack) throws Exception;
}

package cn.itcast.ssm.service.impl;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/**
 * 
 * ��Ʒ����service
 * @author lenovo
 *
 */
public interface ItemsService {
	//��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}

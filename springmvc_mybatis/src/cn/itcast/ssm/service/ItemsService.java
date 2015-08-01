package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

public interface ItemsService {

	//��Ʒ��ѯ�б�
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	//����id��ѯ��Ʒ��Ϣ
	public ItemsCustom findItemsById(Integer id) throws Exception;
	
	//�޸���Ʒ��Ϣ
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;
	
	//ɾ����Ʒ��Ϣ
	public void deleteItems(Integer id) throws Exception;
}

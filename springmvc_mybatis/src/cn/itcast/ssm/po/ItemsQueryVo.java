package cn.itcast.ssm.po;

import java.util.List;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description:商品包装对象 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:22:36
 * @version 1.0
 */
public class ItemsQueryVo {
	
	//��Ʒ��Ϣ
	private Items items;
	
	//Ϊ��ϵͳ��չ�� ��ԭ��po������չ
	private ItemsCustom itemsCustom;
	
	//������Ʒ��Ϣ
	private List<ItemsCustom> itemsList;

	public List<ItemsCustom> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<ItemsCustom> itemsList) {
		this.itemsList = itemsList;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	

}

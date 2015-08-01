package cn.itcast.ssm.po;

import java.util.List;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description:鍟嗗搧鍖呰瀵硅薄 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2015-4-13涓嬪崍3:22:36
 * @version 1.0
 */
public class ItemsQueryVo {
	
	//商品信息
	private Items items;
	
	//为了系统扩展性 对原生po进行扩展
	private ItemsCustom itemsCustom;
	
	//批量商品信息
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

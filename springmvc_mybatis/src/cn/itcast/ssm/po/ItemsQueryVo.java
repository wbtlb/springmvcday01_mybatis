package cn.itcast.ssm.po;

public class ItemsQueryVo {
	
	//商品信息
	private Items items;
	
	//为了系统可扩展性 对原生po进行扩展 
	private ItemsCustom itemsCustom;

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

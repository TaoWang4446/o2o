package com.imooc.o2o.entity;

import java.util.Date;

public class ShopCategory {
	// 店铺类别ID
	private Long shopCategoryId;
	// 店铺类别名词
	private String shopCategoryName;
	// 店铺类别描述
	private String shopCategoryDesc;
	// 店铺类别图片
	private String shopCategoryImg;
	// 店铺类别权重
	private Integer prority;
	// 店铺类别上级id
	private ShopCategory parent;
	// 创建时间
	private Date createTime;
	// 最后修改时间
	private Date lastEditTime;

	public Long getShopCategoryId() {
		return shopCategoryId;
	}

	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}

	public String getShopCategoryName() {
		return shopCategoryName;
	}

	public void setShopCategoryName(String shopCategoryName) {
		this.shopCategoryName = shopCategoryName;
	}

	public String getShopCategoryDesc() {
		return shopCategoryDesc;
	}

	public void setShopCategoryDesc(String shopCategoryDesc) {
		this.shopCategoryDesc = shopCategoryDesc;
	}

	public String getShopCategoryImg() {
		return shopCategoryImg;
	}

	public void setShopCategoryImg(String shopCategoryImg) {
		this.shopCategoryImg = shopCategoryImg;
	}

	public Integer getPrority() {
		return prority;
	}

	public void setPrority(Integer prority) {
		this.prority = prority;
	}

	public ShopCategory getParent() {
		return parent;
	}

	public void setParent(ShopCategory parent) {
		this.parent = parent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

}

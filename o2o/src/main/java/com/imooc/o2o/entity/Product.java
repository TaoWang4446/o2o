package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
	// 商品ID
	private Long productId;
	// 商品名称
	private String productName;
	// 商品描述
	private String productDesc;
	// 简略图地址
	private String productAddr;
	// 商品原价
	private String normalPrice;
	// 商品折扣价
	private String promotionPrice;
	// 商品显示权重
	private Integer priority;
	// 创建时间
	private Date creatTime;
	// 最后修改时间
	private Date lastEditTime;
	// 商品上架/下架标识[0:下架;1:在前端展示系统展示]
	private Integer enableStatus;
	// 商品图片列表
	private List<ProductImg> productList;
	// 商品类别
	private ProductCategory productCategory;
	// 商品所在店铺
	private Shop shop;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductAddr() {
		return productAddr;
	}

	public void setProductAddr(String productAddr) {
		this.productAddr = productAddr;
	}

	public String getNormalPrice() {
		return normalPrice;
	}

	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}

	public String getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public List<ProductImg> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductImg> productList) {
		this.productList = productList;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

}

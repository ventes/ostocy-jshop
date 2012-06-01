package com.jshop.entity;

// Generated 2012-5-31 15:44:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsTypeTN generated by hbm2java
 */
public class GoodsTypeTN implements java.io.Serializable {

	private String goodsTypeId;
	private String name;
	private Date createtime;
	private String creatorid;
	private String goodsParameter;

	public GoodsTypeTN() {
	}

	public GoodsTypeTN(String goodsTypeId, String name, Date createtime,
			String creatorid) {
		this.goodsTypeId = goodsTypeId;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public GoodsTypeTN(String goodsTypeId, String name, Date createtime,
			String creatorid, String goodsParameter) {
		this.goodsTypeId = goodsTypeId;
		this.name = name;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.goodsParameter = goodsParameter;
	}

	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getGoodsParameter() {
		return this.goodsParameter;
	}

	public void setGoodsParameter(String goodsParameter) {
		this.goodsParameter = goodsParameter;
	}

}
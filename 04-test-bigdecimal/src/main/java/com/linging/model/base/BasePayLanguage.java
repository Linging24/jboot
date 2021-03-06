package com.linging.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePayLanguage<M extends BasePayLanguage<M>> extends JbootModel<M> implements IBean {

	/**
	 * 主键
	 */
	public void setId(java.lang.String id) {
		set("id", id);
	}

    /**
     * 主键
     */
	public java.lang.String getId() {
		return getStr("id");
	}

	/**
	 * 业务类型【1：发现管理(展示名字),2：货币管理(币种简介),3：货币管理(提币描述),4：货币管理(充币描述)】
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}

    /**
     * 业务类型【1：发现管理(展示名字),2：货币管理(币种简介),3：货币管理(提币描述),4：货币管理(充币描述)】
     */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 语言（0：英文 1：中文 2：繁体 3：越南语)
	 */
	public void setLanguage(java.lang.Integer language) {
		set("language", language);
	}

    /**
     * 语言（0：英文 1：中文 2：繁体 3：越南语)
     */
	public java.lang.Integer getLanguage() {
		return getInt("language");
	}

	/**
	 * code码 (业务类型为发现管理, 则code的值1.Mighty Pay，2.HD钱包，3.闪兑，4.积分商城，5.游戏，6.DAPP，7.金融) （业务类型为货币管理，则code为：币种_链）
	 */
	public void setCode(java.lang.String code) {
		set("code", code);
	}

    /**
     * code码 (业务类型为发现管理, 则code的值1.Mighty Pay，2.HD钱包，3.闪兑，4.积分商城，5.游戏，6.DAPP，7.金融) （业务类型为货币管理，则code为：币种_链）
     */
	public java.lang.String getCode() {
		return getStr("code");
	}

	/**
	 * 描述
	 */
	public void setManage(java.lang.String manage) {
		set("manage", manage);
	}

    /**
     * 描述
     */
	public java.lang.String getManage() {
		return getStr("manage");
	}

	/**
	 * 描述2
	 */
	public void setManage2(java.lang.String manage2) {
		set("manage2", manage2);
	}

    /**
     * 描述2
     */
	public java.lang.String getManage2() {
		return getStr("manage2");
	}

	/**
	 * 创建人
	 */
	public void setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
	}

    /**
     * 创建人
     */
	public java.lang.String getCreateBy() {
		return getStr("create_by");
	}

	/**
	 * 创建时间
	 */
	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreateDate() {
		return getDate("create_date");
	}

	/**
	 * 更新人
	 */
	public void setUpdateBy(java.lang.String updateBy) {
		set("update_by", updateBy);
	}

    /**
     * 更新人
     */
	public java.lang.String getUpdateBy() {
		return getStr("update_by");
	}

	/**
	 * 更新时间
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}

    /**
     * 更新时间
     */
	public java.util.Date getUpdateDate() {
		return getDate("update_date");
	}

}

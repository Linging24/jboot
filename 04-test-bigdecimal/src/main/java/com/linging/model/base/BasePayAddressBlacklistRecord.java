package com.linging.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePayAddressBlacklistRecord<M extends BasePayAddressBlacklistRecord<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return getStr("id");
	}

	/**
	 * 业务id
	 */
	public void setTranId(java.lang.String tranId) {
		set("tran_id", tranId);
	}

    /**
     * 业务id
     */
	public java.lang.String getTranId() {
		return getStr("tran_id");
	}

	/**
	 * 币种
	 */
	public void setCoin(java.lang.String coin) {
		set("coin", coin);
	}

    /**
     * 币种
     */
	public java.lang.String getCoin() {
		return getStr("coin");
	}

	/**
	 * 用户id
	 */
	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}

    /**
     * 用户id
     */
	public java.lang.String getUserId() {
		return getStr("user_id");
	}

	/**
	 * 转出状态（0：转出成功  1：转出失败）默认：0
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 转出状态（0：转出成功  1：转出失败）默认：0
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 黑名单地址
	 */
	public void setBlacklistAddress(java.lang.String blacklistAddress) {
		set("blacklist_address", blacklistAddress);
	}

    /**
     * 黑名单地址
     */
	public java.lang.String getBlacklistAddress() {
		return getStr("blacklist_address");
	}

	/**
	 * 打款地址
	 */
	public void setFromAddress(java.lang.String fromAddress) {
		set("from_address", fromAddress);
	}

    /**
     * 打款地址
     */
	public java.lang.String getFromAddress() {
		return getStr("from_address");
	}

	/**
	 * 删除标记[0:未删除，1：已删除]
	 */
	public void setDelFlag(java.lang.Integer delFlag) {
		set("del_flag", delFlag);
	}

    /**
     * 删除标记[0:未删除，1：已删除]
     */
	public java.lang.Integer getDelFlag() {
		return getInt("del_flag");
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

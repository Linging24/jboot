package com.linging.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePayRoleCoinManage<M extends BasePayRoleCoinManage<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return getStr("id");
	}

	/**
	 * 角色ID
	 */
	public void setRoleId(java.lang.String roleId) {
		set("role_id", roleId);
	}

    /**
     * 角色ID
     */
	public java.lang.String getRoleId() {
		return getStr("role_id");
	}

	/**
	 * 权限类型（
1.Pay提币手续费减
2.Pay转账手续费减
3.Pay彩蛋手续费减
4.Pay提币不限额度
5.Pay转账不限额度
6.Pay彩蛋不限额度
）
	 */
	public void setTabType(java.lang.Integer tabType) {
		set("tab_type", tabType);
	}

    /**
     * 权限类型（
1.Pay提币手续费减
2.Pay转账手续费减
3.Pay彩蛋手续费减
4.Pay提币不限额度
5.Pay转账不限额度
6.Pay彩蛋不限额度
）
     */
	public java.lang.Integer getTabType() {
		return getInt("tab_type");
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
	 * 链
	 */
	public void setCoinCode(java.lang.String coinCode) {
		set("coin_code", coinCode);
	}

    /**
     * 链
     */
	public java.lang.String getCoinCode() {
		return getStr("coin_code");
	}

	/**
	 * 手续费类型(0:固定，1：百分比)

	 */
	public void setTranType(java.lang.Integer tranType) {
		set("tran_type", tranType);
	}

    /**
     * 手续费类型(0:固定，1：百分比)

     */
	public java.lang.Integer getTranType() {
		return getInt("tran_type");
	}

	/**
	 * 数额(0则不收)
	 */
	public void setFeeRatioTrans(java.math.BigDecimal feeRatioTrans) {
		set("fee_ratio_trans", feeRatioTrans);
	}

    /**
     * 数额(0则不收)
     */
	public java.math.BigDecimal getFeeRatioTrans() {
		return get("fee_ratio_trans");
	}

	/**
	 * 配置类型（0：全部币种，1指定币种）
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}

    /**
     * 配置类型（0：全部币种，1指定币种）
     */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	/**
	 * 权限组【1:Pay转账收款手续费减免】（字段弃用）
	 */
	public void setGroupCode(java.lang.String groupCode) {
		set("group_code", groupCode);
	}

    /**
     * 权限组【1:Pay转账收款手续费减免】（字段弃用）
     */
	public java.lang.String getGroupCode() {
		return getStr("group_code");
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
	 * 修改人
	 */
	public void setUpdateBy(java.lang.String updateBy) {
		set("update_by", updateBy);
	}

    /**
     * 修改人
     */
	public java.lang.String getUpdateBy() {
		return getStr("update_by");
	}

	/**
	 * 修改时间
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		set("update_date", updateDate);
	}

    /**
     * 修改时间
     */
	public java.util.Date getUpdateDate() {
		return getDate("update_date");
	}

}

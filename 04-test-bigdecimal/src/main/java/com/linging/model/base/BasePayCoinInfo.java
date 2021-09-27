package com.linging.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePayCoinInfo<M extends BasePayCoinInfo<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	/**
	 * 币种名称
	 */
	public void setCoinName(java.lang.String coinName) {
		set("coin_name", coinName);
	}

    /**
     * 币种名称
     */
	public java.lang.String getCoinName() {
		return getStr("coin_name");
	}

	/**
	 * 币种简称
	 */
	public void setCoin(java.lang.String coin) {
		set("coin", coin);
	}

    /**
     * 币种简称
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
	 * 币种排序
	 */
	public void setCoinSort(java.lang.Integer coinSort) {
		set("coin_sort", coinSort);
	}

    /**
     * 币种排序
     */
	public java.lang.Integer getCoinSort() {
		return getInt("coin_sort");
	}

	/**
	 * 流通数量
	 */
	public void setInCircuation(java.math.BigDecimal inCircuation) {
		set("in_circuation", inCircuation);
	}

    /**
     * 流通数量
     */
	public java.math.BigDecimal getInCircuation() {
		return get("in_circuation");
	}

	/**
	 * 发行总量
	 */
	public void setTotalAmount(java.math.BigDecimal totalAmount) {
		set("total_amount", totalAmount);
	}

    /**
     * 发行总量
     */
	public java.math.BigDecimal getTotalAmount() {
		return get("total_amount");
	}

	/**
	 * 发行日期
	 */
	public void setLssueDate(java.util.Date lssueDate) {
		set("lssue_date", lssueDate);
	}

    /**
     * 发行日期
     */
	public java.util.Date getLssueDate() {
		return getDate("lssue_date");
	}

	/**
	 * 发行价格
	 */
	public void setTokenPrice(java.math.BigDecimal tokenPrice) {
		set("token_price", tokenPrice);
	}

    /**
     * 发行价格
     */
	public java.math.BigDecimal getTokenPrice() {
		return get("token_price");
	}

	/**
	 * 是否可用(1 是 0:否 )
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 是否可用(1 是 0:否 )
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 转账类型: (0 : 地址转账 1: MEMO转账 )
	 */
	public void setTarnferType(java.lang.Integer tarnferType) {
		set("tarnfer_type", tarnferType);
	}

    /**
     * 转账类型: (0 : 地址转账 1: MEMO转账 )
     */
	public java.lang.Integer getTarnferType() {
		return getInt("tarnfer_type");
	}

	/**
	 * 币种图标
	 */
	public void setLogo(java.lang.String logo) {
		set("logo", logo);
	}

    /**
     * 币种图标
     */
	public java.lang.String getLogo() {
		return getStr("logo");
	}

	/**
	 * 是否开启提币：0开启；1关闭
	 */
	public void setWhetherOpenWithdraw(java.lang.Integer whetherOpenWithdraw) {
		set("whether_open_withdraw", whetherOpenWithdraw);
	}

    /**
     * 是否开启提币：0开启；1关闭
     */
	public java.lang.Integer getWhetherOpenWithdraw() {
		return getInt("whether_open_withdraw");
	}

	/**
	 * 是否开启充值：0开启；1关闭
	 */
	public void setWhetherOpenRecharge(java.lang.Integer whetherOpenRecharge) {
		set("whether_open_recharge", whetherOpenRecharge);
	}

    /**
     * 是否开启充值：0开启；1关闭
     */
	public java.lang.Integer getWhetherOpenRecharge() {
		return getInt("whether_open_recharge");
	}

	/**
	 * 是否开启转账：0开启；1关闭
	 */
	public void setWhetherOpenTransfer(java.lang.Integer whetherOpenTransfer) {
		set("whether_open_transfer", whetherOpenTransfer);
	}

    /**
     * 是否开启转账：0开启；1关闭
     */
	public java.lang.Integer getWhetherOpenTransfer() {
		return getInt("whether_open_transfer");
	}

	/**
	 * 是否开启红包功能：0开启；1关闭
	 */
	public void setWhetherOpenRed(java.lang.Integer whetherOpenRed) {
		set("whether_open_red", whetherOpenRed);
	}

    /**
     * 是否开启红包功能：0开启；1关闭
     */
	public java.lang.Integer getWhetherOpenRed() {
		return getInt("whether_open_red");
	}

	/**
	 * 是否开启法币功能：0开启；1关闭
	 */
	public void setWhetherOpenOtc(java.lang.Integer whetherOpenOtc) {
		set("whether_open_otc", whetherOpenOtc);
	}

    /**
     * 是否开启法币功能：0开启；1关闭
     */
	public java.lang.Integer getWhetherOpenOtc() {
		return getInt("whether_open_otc");
	}

	/**
	 * 是否可编辑：0可以编辑；1不可编辑
	 */
	public void setEditable(java.lang.Integer editable) {
		set("editable", editable);
	}

    /**
     * 是否可编辑：0可以编辑；1不可编辑
     */
	public java.lang.Integer getEditable() {
		return getInt("editable");
	}

	/**
	 * 展示精度
	 */
	public void setShowAmount(java.lang.Integer showAmount) {
		set("show_amount", showAmount);
	}

    /**
     * 展示精度
     */
	public java.lang.Integer getShowAmount() {
		return getInt("show_amount");
	}

	/**
	 * 合约地址
	 */
	public void setToken(java.lang.String token) {
		set("token", token);
	}

    /**
     * 合约地址
     */
	public java.lang.String getToken() {
		return getStr("token");
	}

	/**
	 * 币种位数(小数点后有几个零)
	 */
	public void setWei(java.lang.Integer wei) {
		set("wei", wei);
	}

    /**
     * 币种位数(小数点后有几个零)
     */
	public java.lang.Integer getWei() {
		return getInt("wei");
	}

	/**
	 * 颜色
	 */
	public void setColor(java.lang.String color) {
		set("color", color);
	}

    /**
     * 颜色
     */
	public java.lang.String getColor() {
		return getStr("color");
	}

	/**
	 * 浏览器链接
	 */
	public void setExplorerUrl(java.lang.String explorerUrl) {
		set("explorer_url", explorerUrl);
	}

    /**
     * 浏览器链接
     */
	public java.lang.String getExplorerUrl() {
		return getStr("explorer_url");
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
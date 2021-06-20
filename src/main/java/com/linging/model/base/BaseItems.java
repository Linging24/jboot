package com.linging.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseItems<M extends BaseItems<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setPrice(java.lang.Float price) {
		set("price", price);
	}

	public java.lang.Float getPrice() {
		return getFloat("price");
	}

	public void setPic(java.lang.String pic) {
		set("pic", pic);
	}

	public java.lang.String getPic() {
		return getStr("pic");
	}

	public void setCreatetime(java.util.Date createtime) {
		set("createtime", createtime);
	}

	public java.util.Date getCreatetime() {
		return getDate("createtime");
	}

	public void setDetail(java.lang.String detail) {
		set("detail", detail);
	}

	public java.lang.String getDetail() {
		return getStr("detail");
	}

}

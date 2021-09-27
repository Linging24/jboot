package com.linging.service;

import com.jfinal.plugin.activerecord.Page;
import com.linging.model.PayCoinManageOtc;
import io.jboot.db.model.Columns;

import java.util.List;

public interface PayCoinManageOtcService  {

    /**
     * 根据主键查找Model
     *
     * @param id
     * @return
     */
    public PayCoinManageOtc findById(Object id);


    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @return
     */
    public PayCoinManageOtc findFirstByColumns(Columns columns);

    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public PayCoinManageOtc findFirstByColumns(Columns columns, String orderBy);


    /**
     * 查找全部数据
     *
     * @return
     */
    public List<PayCoinManageOtc> findAll();


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @return
     */
    public List<PayCoinManageOtc> findListByColumns(Columns columns);


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public List<PayCoinManageOtc> findListByColumns(Columns columns, String orderBy);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param count
     * @return
     */
    public List<PayCoinManageOtc> findListByColumns(Columns columns, Integer count);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @param count
     * @return
     */
    public List<PayCoinManageOtc> findListByColumns(Columns columns, String orderBy, Integer count);


    /**
     * 根据提交查询数据量
     *
     * @param columns
     * @return
     */
    public long findCountByColumns(Columns columns);


    /**
     * 根据ID 删除model
     *
     * @param id
     * @return
     */
    public boolean deleteById(Object id);


    /**
     * 删除
     *
     * @param model
     * @return
     */
    public boolean delete(PayCoinManageOtc model);


    /**
     * 根据 多个 id 批量删除
     *
     * @param ids
     * @return
     */
    public boolean batchDeleteByIds(Object... ids);


    /**
     * 保存到数据库
     *
     * @param model
     * @return id if success
     */
    public Object save(PayCoinManageOtc model);


    /**
     * 保存或更新
     *
     * @param model
     * @return id if success
     */
    public Object saveOrUpdate(PayCoinManageOtc model);

    /**
     * 更新
     *
     * @param model
     * @return
     */
    public boolean update(PayCoinManageOtc model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<PayCoinManageOtc> paginate(int page, int pageSize);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<PayCoinManageOtc> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return
     */
    public Page<PayCoinManageOtc> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}
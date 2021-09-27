package com.linging.service;

import com.jfinal.plugin.activerecord.Page;
import com.linging.model.PayAddressBlacklistRecord;
import io.jboot.db.model.Columns;

import java.util.List;

public interface PayAddressBlacklistRecordService  {

    /**
     * 根据主键查找Model
     *
     * @param id
     * @return
     */
    public PayAddressBlacklistRecord findById(Object id);


    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @return
     */
    public PayAddressBlacklistRecord findFirstByColumns(Columns columns);

    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public PayAddressBlacklistRecord findFirstByColumns(Columns columns, String orderBy);


    /**
     * 查找全部数据
     *
     * @return
     */
    public List<PayAddressBlacklistRecord> findAll();


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @return
     */
    public List<PayAddressBlacklistRecord> findListByColumns(Columns columns);


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public List<PayAddressBlacklistRecord> findListByColumns(Columns columns, String orderBy);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param count
     * @return
     */
    public List<PayAddressBlacklistRecord> findListByColumns(Columns columns, Integer count);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @param count
     * @return
     */
    public List<PayAddressBlacklistRecord> findListByColumns(Columns columns, String orderBy, Integer count);


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
    public boolean delete(PayAddressBlacklistRecord model);


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
    public Object save(PayAddressBlacklistRecord model);


    /**
     * 保存或更新
     *
     * @param model
     * @return id if success
     */
    public Object saveOrUpdate(PayAddressBlacklistRecord model);

    /**
     * 更新
     *
     * @param model
     * @return
     */
    public boolean update(PayAddressBlacklistRecord model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<PayAddressBlacklistRecord> paginate(int page, int pageSize);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<PayAddressBlacklistRecord> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return
     */
    public Page<PayAddressBlacklistRecord> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}
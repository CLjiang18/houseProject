package com.yanzhen.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.yanzhen.model.Lookhouse;
import io.swagger.models.auth.In;

/**
 * <p>
 * 看房信息表 服务类
 * </p>
 *
 * @author maqh
 * @since 2020-08-21
 */
public interface ILookhouseService extends IService<Lookhouse> {

    /**
     * 分页查询看房信息列表
     */
    PageInfo<Lookhouse> findLookHouseAll(int page,int limit,Lookhouse lookhouse);


    /**
     * 查询看房信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Lookhouse>
     */
    IPage<Lookhouse> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加看房信息表
     *
     * @param lookhouse 看房信息表
     * @return int
     */
    int add(Lookhouse lookhouse);

    /**
     * 删除看房信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改看房信息表
     *
     * @param lookhouse 看房信息表
     * @return int
     */
    int updateData(Lookhouse lookhouse);

    /**
     * 根据id获取相关信息
     */
    Lookhouse queryById(Integer id);

}

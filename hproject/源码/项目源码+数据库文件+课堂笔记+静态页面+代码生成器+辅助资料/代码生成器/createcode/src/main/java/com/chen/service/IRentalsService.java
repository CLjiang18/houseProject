package com.chen.service;

import com.chen.pojo.Rentals;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 收租信息表 服务类
 * </p>
 *
 * @author chen
 * @since 2021-09-01
 */
public interface IRentalsService extends IService<Rentals> {

    /**
     * 查询收租信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Rentals>
     */
    IPage<Rentals> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加收租信息表
     *
     * @param rentals 收租信息表
     * @return int
     */
    int add(Rentals rentals);

    /**
     * 删除收租信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改收租信息表
     *
     * @param rentals 收租信息表
     * @return int
     */
    int updateData(Rentals rentals);

    /**
     * id查询数据
     *
     * @param id id
     * @return Rentals
     */
    Rentals findById(Long id);
}

package com.erui.order.service;

import com.erui.order.entity.Purch;
import com.erui.order.entity.PurchGoods;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by wangxiaodan on 2017/12/11.
 */
public interface PurchService {
    /**
     * 根据id查询采购基本信息
     * @param id
     * @return
     */
    Purch findBaseInfo(Integer id);

    /**
     * 根据条件分页查询采购信息列表
     * @param condition
     * @return
     */
    Page<Purch> findByPage(Purch condition) ;

    boolean update(Purch purchVo);

    boolean insert(Purch purchVo);

    /**
     * 查询采购详情信息
     * @param id    采购ID
     * @return
     */
    Purch findDetailInfo(Integer id);

    /**
     * 查询采购中可以新增报检单的商品列表
     * @param id
     * @return
     */
    List<PurchGoods> findInspectGoodsByPurch(Integer id);
}

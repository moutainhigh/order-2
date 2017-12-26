package com.erui.order.service;

import com.erui.order.entity.DeliverDetail;
import com.erui.order.requestVo.DeliverD;
import com.erui.order.requestVo.DeliverDetailVo;
import com.erui.order.requestVo.DeliverW;
import org.springframework.data.domain.Page;

/**
 * Created by wangxiaodan on 2017/12/11.
 */
public interface DeliverDetailService {
    /**
     * 根据id查询出库详情信息
     * @param id
     * @return
     */
    DeliverDetail findById(Integer id);

    /**
     * 分页查询物流-出库单详情列表
     * @param condition
     * @return
     */
    Page<DeliverDetail> listByPage(DeliverDetailVo condition);

    /**
     * 查询物流-出库单详情
     * @param id
     * @return
     */
    DeliverDetail findDetailById(Integer id);

    /**
     * 保存物流-出库单详情
     * @param deliverDetailVo
     * @return
     */
    boolean save(DeliverDetailVo deliverDetailVo) throws Exception;

    /**
     * 出库管理
     *
     * @param deliverD
     * @return
     */
    Page<DeliverDetail> outboundManage(DeliverD deliverD);


    /**
     * 物流跟踪管理
     *
     */
    Page<DeliverDetail> logisticsTraceManage(DeliverW deliverW);



    /**
     * 出库详情页 保存 or 提交质检
     *
     * @param deliverDetail
     * @return
     */
    boolean outboundSaveOrAdd(DeliverDetail deliverDetail);


    /**
     * 物流动态跟踪 - 物流信息
     *
     * @param id    物流数据id
     * @return
     */
    DeliverDetail logisticsMoveFollow(Integer id);


    /**
     * 物流动态跟踪 ：动态更新-项目完结
     *
     * @param deliverDetail
     * @return
     */
    void logisticsActionAddOrSave(DeliverDetail deliverDetail);

    /**
     * 物流管理 - 查看页面
     *
     * @param id    物流数据id
     * @return
     */
    DeliverDetail queryLogisticsTrace(Integer id);
}

package com.erui.order.service.impl;

import com.erui.order.dao.AreaDao;
import com.erui.order.entity.Area;
import com.erui.order.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangxiaodan on 2017/12/11.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public Area findById(Integer id) {
        return areaDao.findOne(id);
    }
}

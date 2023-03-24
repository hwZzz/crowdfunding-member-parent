package com.crowd.service.impl;

import com.crowd.entity.vo.OrderProjectVO;
import com.crowd.mapper.AddressPOMapper;
import com.crowd.mapper.OrderPOMapper;
import com.crowd.mapper.OrderProjectPOMapper;
import com.crowd.service.api.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderProjectPOMapper projectPOMapper;

    @Autowired
    private OrderPOMapper orderPOMapper;

    @Autowired
    private AddressPOMapper addressPOMapper;

    @Override
    public OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId) {
        return null;
    }
}

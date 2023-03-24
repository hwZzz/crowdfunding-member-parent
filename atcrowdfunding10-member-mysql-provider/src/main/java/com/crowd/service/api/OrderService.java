package com.crowd.service.api;

import com.crowd.entity.vo.OrderProjectVO;

public interface OrderService {
    OrderProjectVO getOrderProjectVO(Integer projectId, Integer returnId);
}

package com.crowd.service.impl;

import com.crowd.entity.po.MemberPO;
import com.crowd.entity.po.MemberPOExample;
import com.crowd.mapper.MemberPOMapper;
import com.crowd.service.api.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberPOMapper memberPOMapper;


    @Override
    public MemberPO getMemberPOByLoginAcct(String loginacct) {
        //1.创建Example对象
        MemberPOExample example = new MemberPOExample();

        //创建Criteria对象
        MemberPOExample.Criteria criteria = example.createCriteria();
        //3.封装查询条件
        criteria.andLoginacctEqualTo(loginacct);

        //4.执行查询
        List<MemberPO> list = memberPOMapper.selectByExample(example);

        //5.获取结果
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            rollbackFor = Exception.class,
            readOnly = false)//默认是false
    @Override
    public void saveMember(MemberPO memberPO) {
        memberPOMapper.insertSelective(memberPO);
    }
}

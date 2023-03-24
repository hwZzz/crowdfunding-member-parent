package com.crowd.service.api;

import com.crowd.entity.vo.DetailProjectVO;
import com.crowd.entity.vo.PortalTypeVO;
import com.crowd.entity.vo.ProjectVO;

import java.util.List;

public interface ProjectService {
    void saveProject(ProjectVO projectVO, Integer memberId);
    List<PortalTypeVO> getPortalTypeVO();

    DetailProjectVO getDetailProjectVO(Integer projectId);
}

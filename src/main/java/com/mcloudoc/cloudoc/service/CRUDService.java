package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.dto.CRUDTestDto;
import com.mcloudoc.cloudoc.entity.CRUDTest;
import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.repository.CRUDTestRepository;
import com.mcloudoc.cloudoc.repository.TotalPoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CRUDService {

    public CRUDTestDto saveItem(CRUDTestDto crudTest);

    public List<CRUDTest> selectListAll();
    public CRUDTest findById(Long id);
    public int deleteItem(Long id);

}

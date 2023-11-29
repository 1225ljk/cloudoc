package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.repository.TotalPoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TotalPoliciesServiceImpl implements TotalPoliciesService {
    @Autowired
    private TotalPoliciesRepository totalPoliciesRepository;

    @Override
    public List<TotalPolicies> selectListAll(String DomainID){
        return totalPoliciesRepository.findDomainId(DomainID);
    }
}

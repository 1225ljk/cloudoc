package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.entity.TotalPolicies;

import java.util.List;

public interface TotalPoliciesService {

    public List<TotalPolicies> selectListAll(String DomainID) ;

}

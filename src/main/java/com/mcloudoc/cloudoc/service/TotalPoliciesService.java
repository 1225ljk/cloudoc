package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.entity.TotalPolicies;

import java.util.List;

public interface TotalPoliciesService {

    List<TotalPolicies> selectListAll(String DomainID) ;
}

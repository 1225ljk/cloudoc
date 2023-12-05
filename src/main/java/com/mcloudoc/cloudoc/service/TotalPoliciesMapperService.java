package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.dto.TotalPoliciesDto;
import com.mcloudoc.cloudoc.entity.TotalPolicies;

import java.util.List;

public interface TotalPoliciesMapperService {
    public List<TotalPoliciesDto> getPoliciesList(String DomainID);
}

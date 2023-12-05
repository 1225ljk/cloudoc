package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.dto.TotalPoliciesDto;
import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.mapper.TotalPoliciesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TotalPoliciesMapperServiceImpl implements TotalPoliciesMapperService {
    private final TotalPoliciesMapper totalPoliciesMapper;
    @Override
    public List<TotalPoliciesDto> getPoliciesList(String DomainId) {
        return totalPoliciesMapper.getTotalPoliciesList(DomainId);
    }
}

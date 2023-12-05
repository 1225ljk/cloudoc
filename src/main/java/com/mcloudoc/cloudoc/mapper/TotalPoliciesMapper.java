package com.mcloudoc.cloudoc.mapper;

import com.mcloudoc.cloudoc.dto.TotalPoliciesDto;
import com.mcloudoc.cloudoc.entity.TotalPolicies;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TotalPoliciesMapper {

    List<TotalPoliciesDto> getTotalPoliciesList(String DomainID);

}

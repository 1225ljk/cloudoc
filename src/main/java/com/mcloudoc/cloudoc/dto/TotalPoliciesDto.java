package com.mcloudoc.cloudoc.dto;

import com.mcloudoc.cloudoc.entity.TotalPolicies;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TotalPoliciesDto {

    private Long domainId;
    private String policyId;
    private String policyName;
    private String regDate;
    private String lastModifyDate;
    private String memo;
}

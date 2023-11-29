package com.mcloudoc.cloudoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TotalPolicies")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TotalPolicies {

    @Id
    @Column(name = "DomainID" , length = 20, nullable = false)
    private Long domainId;
    @Id
    @Column(name = "PolicyID" , length = 20, nullable = false)
    private String policyId;
    @Column(name = "PolicyName" , length = 50, nullable = false)
    private String policyName;
    @Column(name = "RegDate" , length = 14, nullable = false)
    private String regDate;
    @Column(name = "LastModifyDate" , length = 14)
    private String lastModifyDate;
    @Column(name = "Memo" , columnDefinition = "TEXT")
    private String memo;


}

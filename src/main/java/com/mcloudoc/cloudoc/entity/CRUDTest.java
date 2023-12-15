package com.mcloudoc.cloudoc.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="CRUDTest")
@NoArgsConstructor
@AllArgsConstructor
@Data
@SequenceGenerator(
        name="SEQ_CRUD_GEN",
        sequenceName = "SEQ_CRUD",
        initialValue = 1,
        allocationSize = 1
)
public class CRUDTest {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "SEQ_CRUD_GEN")
    private Long Id;

    @Column(name = "PolicyID" , length = 20, nullable = false)
    private String policyId;
    @Column(name = "PolicyName" , length = 50, nullable = false)
    private String policyName;

    @Column(name = "RegDate" , length = 14, nullable = false)
    private String regDate;
    @Column(name = "LastModifyDate" , length = 14)
    private String lastModifyDate;

}

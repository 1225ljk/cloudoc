package com.mcloudoc.cloudoc.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CRUDTestDto {

    private Long Id;

    private String PolicyID;
    private String PolicyName;

    private String RegDate;
    private String LastModifyDate;

}

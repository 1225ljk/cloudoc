package com.mcloudoc.cloudoc.repository;

import com.mcloudoc.cloudoc.dto.CRUDTestDto;
import com.mcloudoc.cloudoc.entity.CRUDTest;
import com.mcloudoc.cloudoc.service.CRUDService;
import com.mcloudoc.cloudoc.service.TotalPoliciesService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Commit
class CRUDTestRepositoryTest {

    @Autowired
    private CRUDService crudService;

    CRUDTestDto crudTestDto=null;

    @BeforeEach
    void setUp() {
        crudTestDto = new CRUDTestDto();
        crudTestDto.setPolicyId("aaaaaa");
        crudTestDto.setPolicyName("aaa");
        crudTestDto.setRegDate("20231215000000");
        crudTestDto.setLastModifyDate("20231215000000");
    }

    @Test
    void save(){
        crudService.saveItem(crudTestDto);
    }

}
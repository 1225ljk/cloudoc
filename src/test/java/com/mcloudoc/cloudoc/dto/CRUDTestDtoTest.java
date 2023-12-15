package com.mcloudoc.cloudoc.dto;

import com.mcloudoc.cloudoc.entity.CRUDTest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Commit

class CRUDTestDtoTest {
    @PersistenceContext
    EntityManager entityManager;

    @Test
    void save(){
        CRUDTest ct = new CRUDTest();
        ct.setPolicyId("aaaaa");
        ct.setPolicyName("aaa");
        ct.setRegDate("20231215000000");
        ct.setLastModifyDate("20231215000000");

        entityManager.persist(ct);
    }


}
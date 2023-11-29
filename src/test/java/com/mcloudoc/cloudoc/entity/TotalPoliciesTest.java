package com.mcloudoc.cloudoc.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Commit
class TotalPoliciesTest {

    @PersistenceContext
    EntityManager e;


    @Test
    void find(){

        String q = "select t from TotalPolicies t where t.domainId = :domainId ";
        List<TotalPolicies> polices = e.createQuery(q, TotalPolicies.class).setParameter("domainId", "1000000000000")
                .getResultList();

        polices.forEach(System.out::println);

    }

}
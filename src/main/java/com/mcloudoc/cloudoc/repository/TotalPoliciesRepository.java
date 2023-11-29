package com.mcloudoc.cloudoc.repository;

import com.mcloudoc.cloudoc.entity.TotalPolicies;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TotalPoliciesRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<TotalPolicies> findDomainId(String DomainId){

        String q = "select t from TotalPolicies t where t.domainId = :domainId ";
        List<TotalPolicies> polices = entityManager.createQuery(q, TotalPolicies.class).setParameter("domainId", DomainId)
                .getResultList();

        return polices;
    }

}

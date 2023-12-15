package com.mcloudoc.cloudoc.repository;

import com.mcloudoc.cloudoc.dto.CRUDTestDto;
import com.mcloudoc.cloudoc.entity.CRUDTest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CRUDTestRepository {
    @PersistenceContext
    EntityManager entityManager;

    //create
    public CRUDTestDto saveItem(CRUDTestDto crudTest){
        CRUDTest ct = new CRUDTest();
        ct.setPolicyId(crudTest.getPolicyID());
        ct.setPolicyName(crudTest.getPolicyName());
        ct.setRegDate(crudTest.getRegDate());
        ct.setLastModifyDate(crudTest.getLastModifyDate());

        entityManager.persist(ct);

        return crudTest;
    }
    //read
    public CRUDTest findById(Long id){

        String q = "select t from CRUDTest t where t.Id = :id ";
        CRUDTest items = entityManager.createQuery(q, CRUDTest.class).setParameter("id", id)
                .getSingleResult();

        return items;
    }

    public List<CRUDTest> selectListAll(){

        String q = "select t from CRUDTest t ";
        List<CRUDTest> items = entityManager.createQuery(q, CRUDTest.class).getResultList();

        return items;
    }

    //update

   /* public CRUDTestDto updateItem(Long id , CRUDTestDto crudTest){

        CRUDTest findItem = entityManager.find(CRUDTest.class, id);

        findItem.setPolicyId(crudTest.getPolicyId());
        findItem.setPolicyId(crudTest.getPolicyName());
        findItem.setPolicyId(crudTest.getRegDate());
        findItem.setPolicyId(crudTest.getLastModifyDate());

        return crudTest;
    }*/

    //delete
    public int deleteItem(Long id){

        CRUDTest findItem = entityManager.find(CRUDTest.class, id);
        entityManager.remove(findItem);

        return 1;
    }

}

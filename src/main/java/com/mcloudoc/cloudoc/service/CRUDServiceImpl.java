package com.mcloudoc.cloudoc.service;

import com.mcloudoc.cloudoc.dto.CRUDTestDto;
import com.mcloudoc.cloudoc.entity.CRUDTest;
import com.mcloudoc.cloudoc.repository.CRUDTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUDServiceImpl implements CRUDService {

    @Autowired
    private CRUDTestRepository crudTestRepository;


    @Override
    public CRUDTestDto saveItem(CRUDTestDto crudTest) {
        return crudTestRepository.saveItem(crudTest);
    }

    @Override
    public List<CRUDTest> selectListAll() {
        return crudTestRepository.selectListAll();
    }

    @Override
    public CRUDTest findById(Long id) {
        return crudTestRepository.findById(id);
    }

    @Override
    public int deleteItem(Long id) {
        return crudTestRepository.deleteItem(id);
    }
}

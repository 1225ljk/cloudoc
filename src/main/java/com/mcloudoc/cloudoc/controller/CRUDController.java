package com.mcloudoc.cloudoc.controller;


import com.mcloudoc.cloudoc.dto.CRUDTestDto;
import com.mcloudoc.cloudoc.dto.TotalPoliciesDto;
import com.mcloudoc.cloudoc.entity.CRUDTest;
import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.service.CRUDService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/crud")
public class CRUDController {

    public CRUDController(){
        System.out.println(getClass().getName() + "() 생성");
    }

    @Autowired
    private CRUDService crudService;


    @RequestMapping("/insert")
    public String insert(){
        return "thymeleaf/views/crud/insert";
    }

    @PostMapping("/insert")
    public String insertTable(@Param(value = "policyId") String policyId,
                              @Param(value = "policyName") String policyName,
                              @Param(value = "regDate") String regDate,
                              @Param(value = "lastModifyDate") String lastModifyDate
                           , Model model ){
        CRUDTestDto ct = new CRUDTestDto();

        ct.setPolicyID(policyId);
        ct.setPolicyName(policyName);
        ct.setRegDate(regDate);
        ct.setLastModifyDate(lastModifyDate);

        CRUDTestDto crudTestDto = crudService.saveItem(ct);

        List<CRUDTest> items = crudService.selectListAll();

        List<CRUDTestDto> totalDtoList = new ArrayList<>(); // 2
        for(CRUDTest item : items){ // 3
            CRUDTestDto dto = CRUDTestDto.builder()
                    .Id(item.getId())
                    .PolicyID(item.getPolicyId())
                    .PolicyName(item.getPolicyName())
                    .RegDate(item.getRegDate())
                    .LastModifyDate(item.getLastModifyDate())
                    .build();

            totalDtoList.add(dto); // 4
        }

        model.addAttribute("result",totalDtoList);

        return "thymeleaf/views/crud/list";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<CRUDTest> items = crudService.selectListAll();

        List<CRUDTestDto> totalDtoList = new ArrayList<>(); // 2

        for(CRUDTest item : items){ // 3
            CRUDTestDto dto = CRUDTestDto.builder()
                    .Id(item.getId())
                    .PolicyID(item.getPolicyId())
                    .PolicyName(item.getPolicyName())
                    .RegDate(item.getRegDate())
                    .LastModifyDate(item.getLastModifyDate())
                    .build();

            totalDtoList.add(dto); // 4
        }

        model.addAttribute("result",totalDtoList);
        return "thymeleaf/views/crud/list";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable Long id){

        CRUDTest foundItem = crudService.findById(id);

        CRUDTestDto dto = CRUDTestDto.builder()
                .Id(foundItem.getId())
                .PolicyID(foundItem.getPolicyId())
                .PolicyName(foundItem.getPolicyName())
                .RegDate(foundItem.getRegDate())
                .LastModifyDate(foundItem.getLastModifyDate())
                .build();

        model.addAttribute("result",dto);

        return "thymeleaf/views/crud/update";

    }

    @PostMapping("/update")
    public String insertTable(@Param(value = "id") Long id,
                              @Param(value = "policyName") String policyName, Model model ) {

        String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        CRUDTest foundItem = crudService.findById(id);
        foundItem.setPolicyName(policyName);
        foundItem.setLastModifyDate(localDateTime);


        List<CRUDTest> items = crudService.selectListAll();

        List<CRUDTestDto> totalDtoList = new ArrayList<>(); // 2
        for(CRUDTest item : items){ // 3
            CRUDTestDto dto = CRUDTestDto.builder()
                    .Id(item.getId())
                    .PolicyID(item.getPolicyId())
                    .PolicyName(item.getPolicyName())
                    .RegDate(item.getRegDate())
                    .LastModifyDate(item.getLastModifyDate())
                    .build();

            totalDtoList.add(dto); // 4
        }

        model.addAttribute("result",totalDtoList);

        return "thymeleaf/views/crud/list";
    }

    @PostMapping("/delete")
    public String deleteOk(@Param(value = "id") Long id, Model model){
        model.addAttribute("result", crudService.deleteItem(id));
        return "thymeleaf/views/crud/deleteOk";
    }
}

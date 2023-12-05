package com.mcloudoc.cloudoc.controller;

import com.mcloudoc.cloudoc.dto.TotalPoliciesDto;
import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.repository.TotalPoliciesRepository;
import com.mcloudoc.cloudoc.service.TotalPoliciesMapperService;
import com.mcloudoc.cloudoc.service.TotalPoliciesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class Home {

    public Home(){
        System.out.println(getClass().getName() + "() 생성");
    }

    @Autowired
    private TotalPoliciesMapperService totalPoliciesMapperService;

    @Autowired
    private TotalPoliciesService totalPoliciesService;


    @RequestMapping("/select/html")
    private String findPolicy(Model model){
        List<TotalPolicies> items = totalPoliciesService.selectListAll("1000000000000");


        List<TotalPoliciesDto> totalPoliciesDtoList = new ArrayList<>(); // 2

        for(TotalPolicies item : items){ // 3
            TotalPoliciesDto dto = TotalPoliciesDto.builder()
                    .domainId(item.getDomainId())
                    .policyId(item.getPolicyId())
                    .policyName(item.getPolicyName())
                    .regDate(item.getRegDate())
                    .lastModifyDate(item.getLastModifyDate())
                    .memo(item.getMemo())
                    .build();

            totalPoliciesDtoList.add(dto); // 4
        }

        model.addAttribute("result",totalPoliciesDtoList);

        return "thymeleaf/views/select";

    }

    @RequestMapping("/select/jsp")
    private String findPolicy2(Model model){
        List<TotalPolicies> items = totalPoliciesService.selectListAll("1000000000000");

        List<TotalPoliciesDto> totalPoliciesDtoList = new ArrayList<>(); // 2

        for(TotalPolicies item : items){ // 3
            TotalPoliciesDto dto = TotalPoliciesDto.builder()
                    .domainId(item.getDomainId())
                    .policyId(item.getPolicyId())
                    .policyName(item.getPolicyName())
                    .regDate(item.getRegDate())
                    .lastModifyDate(item.getLastModifyDate())
                    .memo(item.getMemo())
                    .build();

            totalPoliciesDtoList.add(dto); // 4
        }

        model.addAttribute("result",totalPoliciesDtoList);

        return "select";

    }



    @RequestMapping("/select/mybatis/html")
    private String findPolicy3(Model model){
        List<TotalPoliciesDto> items = totalPoliciesMapperService.getPoliciesList("1000000000000");
        model.addAttribute("result",items);
        return "thymeleaf/views/select";

    }

    @RequestMapping("/select/mybatis/jsp")
    private String findPolicy4(Model model){
        List<TotalPoliciesDto> items = totalPoliciesMapperService.getPoliciesList("1000000000000");
        model.addAttribute("result",items);

        return "select";

    }


}

package com.mcloudoc.cloudoc.controller;

import com.mcloudoc.cloudoc.entity.TotalPolicies;
import com.mcloudoc.cloudoc.repository.TotalPoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class Home {

    public Home(){
        System.out.println(getClass().getName() + "() 생성");
    }

    @Autowired
    private TotalPoliciesRepository totalPoliciesRepository;

    @RequestMapping("/select/html")
    private String findPolicy(Model model){
        List<TotalPolicies> items = totalPoliciesRepository.findDomainId("1000000000000");

        model.addAttribute("result",items);

        return "thymeleaf/views/select";

    }

    @RequestMapping("/select/jsp")
    private String findPolicy2(Model model){
        List<TotalPolicies> items = totalPoliciesRepository.findDomainId("1000000000000");

        model.addAttribute("result",items);

        return "select";

    }

}

package com.hrms.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hrms.entity.Api;
import com.hrms.repository.ApiRepository;

@Controller
public class ApiController {

    /**
     * TODO 暂时直接用REPO，不封装Service
     */
    @Autowired
    private ApiRepository apiRepo;

    /**
     * 跳转至API管理页面
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/apis/manager", method = RequestMethod.GET)
    public String apiManager(Map<String, Object> model) {
        model.put("apis", apiRepo.findAll());
        return "apis_manager";
    }

    @RequestMapping(value = "/apis/save", method = RequestMethod.POST)
    public String apiSave(@Valid Api api) {
        apiRepo.save(api);
        return "redirect:/apis/manager";
    }
}

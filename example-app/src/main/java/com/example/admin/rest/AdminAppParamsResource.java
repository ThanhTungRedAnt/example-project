package com.example.admin.rest;

import com.example.admin.service.AdminAppParamsService;
import com.example.domain.AppParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api/admin")
public class AdminAppParamsResource {
    @Autowired
    private AdminAppParamsService appParamsService;

    @GetMapping("/get-by-app-type")
    public List<AppParams> getByAppType(@RequestParam String appType) {
        return appParamsService.getAllByAppType(appType);
    }
}

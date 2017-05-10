package com.example.controller;

import com.example.dao.DemoDao;
import com.example.entity.Staff;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wenjing on 2017/5/10.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @GetMapping(value = "/{staffName}/{staffAge}/addStaff")
    public Staff addStaff(@PathVariable("staffName")String staffName,
                           @PathVariable("staffAge")String staffAge,
                          @RequestParam(value = "test",required = false)String test) {
        Staff staff = new Staff();
        staff.setStaffName(staffName);
        staff.setStaffAge(staffAge);
       return demoDao.save(staff);
    }

    @GetMapping("/getStaffAll")
    public List<Staff> getStaff(){
        return demoDao.findAll();
    }

    @GetMapping("/{staffName}/getStaffByArgs")
    public List<Staff> getStaffByArgs(@PathVariable("staffName")String staffName){
        return demoDao.findStaffByStaffName(staffName);
    }
    @GetMapping("/{id}/updateStaff")
    public Staff updateStaff(@PathVariable("id") String id){
        Staff staff = new Staff();

        staff.setId(Long.parseLong(id));
        staff.setStaffAge("30");
       return demoDao.save(staff);

    }

    @GetMapping("/{id}/deleteStaff")
    public void deleteStaff(@PathVariable("id") String id){

         demoDao.delete(Long.parseLong(id));

    }



}

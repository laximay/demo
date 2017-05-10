package com.example.service;

import com.example.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wenjing on 2017/5/10.
 */
@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;


}

package com.example.dao;

import com.example.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wenjing on 2017/5/10.
 */
public interface DemoDao extends JpaRepository<Staff, Long> {

    List<Staff> findStaffByStaffName(String args);
}

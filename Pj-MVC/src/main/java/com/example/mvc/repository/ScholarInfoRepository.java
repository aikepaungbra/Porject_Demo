package com.example.mvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.mvc.newScholarship.ScholarInfo;

public interface ScholarInfoRepository extends CrudRepository<ScholarInfo,Integer>{

    public List<ScholarInfo> findAll();
    public ScholarInfo findById(int id);
    public void deleteById(int id);
    

}

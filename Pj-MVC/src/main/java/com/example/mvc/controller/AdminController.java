package com.example.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvc.repository.ScholarInfoRepository;
import com.example.mvc.newScholarship.ScholarInfo;

import com.example.mvc.repository.ScholarInfoRepository;

@RestController
@RequestMapping("/api/adminScholar")
public class AdminController {
  
    @Autowired
    private ScholarInfoRepository scholarRepo;

    @PostMapping("/adminScholarInfo")
    public ResponseEntity<String> addNewRepo(@RequestBody ScholarInfo scholarInfo){
        if(scholarRepo.existsById(scholarInfo.getId())){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        scholarRepo.save(scholarInfo);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping("/adminScholar")
    public ResponseEntity<List<ScholarInfo>> getAllScholarship(){
        if(scholarRepo.findAll().isEmpty()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(scholarRepo.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/adminScholar/{id}")
    public ResponseEntity<String> deleteScholar(@PathVariable int id){
        if(scholarRepo.existsById(id)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        scholarRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}

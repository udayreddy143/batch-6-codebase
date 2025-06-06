package org.jaswincodecraft.controller;

import org.jaswincodecraft.model.Employee;
import org.jaswincodecraft.model.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcExample {

    @GetMapping
    @RequestMapping("/thisisfirstrequest")
    public String m1(@RequestParam(value = "age",required = false) String age,@RequestParam("id") int id){
        System.out.println(age+"--->"+"--->"+id);
        return "hey this is getMapping" ;
    }

        @GetMapping
        @RequestMapping("/thisissecondrequest")
    public String m2(@RequestParam("age") String age,@RequestParam("id") int id,@RequestParam("name") String name){
        System.out.println(age+"--->"+name+"--->"+id);
        return "hey this is getMapping" + name;
    }

    @GetMapping("/{age}/{id}/{name}")
    public String m1(@PathVariable("age") String age, @PathVariable("id") int id, @PathVariable("name") String name){
        System.out.println(age+"--->"+name+"--->"+id);
        return "hey this is getMapping" + name;
    }

    @PostMapping
    public String m2(@RequestBody Student student){
        System.out.println(student);
        return "hey this is  PostMapping";
    }

    @DeleteMapping
    public String m3(){
        return "hey this is  deleteMapping";
    }
    
    @PostMapping
    @RequestMapping("/emp")
    public String formJsonData(@RequestBody Employee employee) {
    	
    	System.out.println("Emp Json Data"+employee);
    	
    	return "Sucussfully json data formatted....";
    }
}

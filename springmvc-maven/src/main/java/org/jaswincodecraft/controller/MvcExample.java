package org.jaswincodecraft.controller;

import org.jaswincodecraft.model.Employee;
import org.jaswincodecraft.model.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public String m2(@RequestParam(value = "age",required = false) String age,@RequestParam("id") int id,@RequestParam("name") String name){
        System.out.println(age+"--->"+name+"--->"+id);
        return "hey this is getMapping" + name;
    }

    @GetMapping("/{age}/{id}/{name}")
    public String m1(@PathVariable("age") String age, @PathVariable("id") int id, @PathVariable(value = "name",required = false) String name){
        System.out.println(age+"--->"+name+"--->"+id);
        return "hey this is getMapping" + name;
    }


    @PostMapping
    public void saveData(@RequestBody Student student){
        System.out.println("this is postmapping"+student);

    }


    @DeleteMapping
    public void deleteRequest(@RequestParam("name") String employeeName){

        System.out.println("deletingv name using quey()delete from Student where name="+employeeName);
    }

    @GetMapping("/{age}/{id}/{name}")
    public String m67(@PathVariable("age") String age, @PathVariable("id") int id, @PathVariable("name") String name){
        System.out.println(age+"--->"+name+"--->"+id);
        return "hey this is getMapping" + name;
    }

    @PostMapping
    public String m2(@RequestBody Student student){
        System.out.println(student);
        return "hey this is  PostMapping";
    }
    @PutMapping
    public void updateAllDFetails(@RequestBody Employee employee){

        System.out.println(employee);

    }

    //i need to update emplotyees address depnds on employee name
    // update employee set empName="priyanka" where id=123;


    @PatchMapping("/{name}/{id}")
    public void updateEmployeeName(@PathVariable("name") String name,@PathVariable("id") int id) {
        System.out.println(name+"=========="+id);
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

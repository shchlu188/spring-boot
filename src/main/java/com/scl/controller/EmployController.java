package com.scl.controller;

import com.scl.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/17
 * Description:
 */
@Controller
public class EmployController {

    @GetMapping("/emps")
    public String list(Model model) {
        List<String> employees = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            employees.add(UUID.randomUUID().toString().substring(0, 8));
        }
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        // 查询所有部门

        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee) {

        return "redirect: /emps";
//        return "forward: /emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        // 获取emp信息，根据id
        // 向model中添加emp信息回显数据
        return "emp/add";

    }

    @PutMapping("/emp")
    public String editEmp(Employee employee) {
        return "redirect: /emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delete(@PathVariable("id") Integer id) {

        return "redirect: /emps";
    }

}

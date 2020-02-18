package com.scl.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/18
 * Description:
 */
@Accessors(chain = true)
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Department department;
    private Integer gender;
    private Date birth;
}

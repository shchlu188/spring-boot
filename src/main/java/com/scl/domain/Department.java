package com.scl.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/18
 * Description:
 */
@Data
@Accessors(chain = true)
public class Department {
    private Integer id;
    private String departmentName;
}

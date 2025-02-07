package com.dis.hrsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeParameter {

    /** 员工编号 */
    public Integer employeeNum;

    /** 姓名 */
    public String name;

    /** Department */
    public String department;

    /** 在职状态 */
    public String employmentStatus;
}

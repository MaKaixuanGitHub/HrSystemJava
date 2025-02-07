package com.dis.hrsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDto {
    /** 员工编号 */
    private String employeeNum;

    /** 姓名 */
    private String name;

    /** Department */
    private String department;

    /** 在职状态 */
    private String employmentStatus;

    /** 性别 */
    private String gender;

    /** 职位/岗位级别 */
    private String position;

    /** 婚姻状况 */
    private String marital;

    /** 有无子女 */
    private String haveChildren;

    /** 入社日期 */
    private String entryDate;

}
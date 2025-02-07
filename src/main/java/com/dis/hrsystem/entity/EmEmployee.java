package com.dis.hrsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 员工属性entity
 *
 * @DIS.zhoudx
 * @version 1.0 2025/01/20
 */
@Data
@AllArgsConstructor
public class EmEmployee {
    /** 员工编号 */
    private String employeeNum;

    /** Department */
    private String department;

    /** 职位 */
    private String position;

    /** 入职是否满两年 */
    private String haveBeenTwoYears;

    /** 在职状态 */
    private String employmentStatus;

    /** 入社日期 */
    private String entryDate;

    /** 离职日期 */
    private String departureDate;

    /** 实习开始日期 */
    private String internStartDate;

    /** 实习结束日期 */
    private String internEndDate;

    /** 试用期开始日 */
    private String trialStartDate;

    /** 试用期结束日 */
    private String trialEndDate;

    /** 转正日期 */
    private String probationaryDate;

    /** 合同起始日 */
    private String contractStartDate;

    /** 合同终止日 */
    private String contractEndDate;

    /** 无固定期限 */
    private String noFixedTermDate;

    /** 工资卡号 */
    private String payrollNum;

    /** 社保编号 */
    private String socialSecurityNum;

    /** 公积金账号 */
    private String cpfNum;
}

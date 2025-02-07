package com.dis.hrsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 员工基本entity
 *
 * @DIS.zhoudx
 * @version 1.0 2025/01/20
 */
@Data
@AllArgsConstructor
public class EmBasic {
    /** 员工编号 */
    private String employeeNum;

    /** 姓名 */
    private String name;

    /** 性别 */
    private String gender;

    /** 出生年月日 */
    private String birthday;

    /** 年龄 */
    private String age;

    /** 婚姻状况 */
    private String marital;

    /** 有无子女 */
    private String haveChildren;

    /** 户籍所在地 */
    private String placeOfDomicle;

    /** 家庭住址 */
    private String homeAddress;

    /** 毕业院校 */
    private String graduateSchool;

    /** 学历 */
    private String degree;

    /** 专业 */
    private String major;

    /** 毕业证书编号 */
    private String diplomaNum;

    /** 手机号 */
    private String tel;

    /** 身份证号 */
    private String idNum;

    /** 联络邮箱 */
    private String email;

    /** 微信号 */
    private String vchat;

    /** 护照号 */
    private String passportNum;

    /** 护照到期时间 */
    private String passportExpiration;

    /** 首次参加工作时间 */
    private String timeOfFirstWork;

}

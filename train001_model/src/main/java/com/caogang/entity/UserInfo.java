package com.caogang.entity;

import lombok.Data;

import javax.management.relation.RoleInfo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;
import java.util.Map;

/**
 * @author: xiaogang
 * @date: 2019/8/5 - 19:44
 */
@Entity
@Data
@Table(name = "base_user")
public class UserInfo extends BaseAuditable{

    @Column(name = "userName")
    private String userName;

    @Column(name = "loginName")
    private String loginName;

    @Column(name = "password")
    private String password;

    @Column(name = "tel")
    private String tel;

    @Column(name = "sex")
    private int sex;

    @Column(name = "parentId")
    private Long parentId;

    @Transient
    private List<MenuInfo> listMenuInfo;

    @Transient
    private RoleInfo roleInfo;

    @Transient
    private Map<String,String> authmap;


}

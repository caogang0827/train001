package com.caogang.dao;

import com.caogang.entity.RoleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: xiaogang
 * @date: 2019/8/5 - 20:08
 */
public interface RoleDao extends JpaRepository<RoleInfo,Long> {

}

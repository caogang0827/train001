package com.caogang.dao;

import com.caogang.entity.MenuInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: xiaogang
 * @date: 2019/8/5 - 20:10
 */
public interface MenuDao extends JpaRepository<MenuInfo, Long> {
}

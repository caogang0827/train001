package com.caogang.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: xiaogang
 * @date: 2019/8/4 - 19:39
 */
@Data
public class IdEntity implements Serializable {

    private Long id;

    private int version;

}

package com.example.homeworkmanagesystem.entity;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Data
@Component("Teacher")
@Scope("prototype")
public class Teacher implements Serializable {
    private static final long serialVersionUID = -68901666412301310L;
    
    private Long id;
    
    private String name;
    
    private String password;
    
    private Date createTime;
    
    private Date updateTime;

}
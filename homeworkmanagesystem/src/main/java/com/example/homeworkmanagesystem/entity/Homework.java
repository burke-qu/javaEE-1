package com.example.homeworkmanagesystem.entity;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (Homework)实体类
 *
 * @author makejava
 * @since 2020-06-18 14:50:36
 */
@Data
@Component("Homework")
@Scope("prototype")
public class Homework implements Serializable {
    private static final long serialVersionUID = 711387306277508928L;
    
    private Long id;
    
    private String title;
    
    private String content;
    
    private Date createTime;
    
    private Date updateTime;

}
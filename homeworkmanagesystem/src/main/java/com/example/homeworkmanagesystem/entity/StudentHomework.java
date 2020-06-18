package com.example.homeworkmanagesystem.entity;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (StudentHomework)实体类
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Data
@Component("StudentHomework")
@Scope("prototype")
public class StudentHomework implements Serializable {
    private static final long serialVersionUID = 862132032149264061L;
    
    private Long id;
    
    private Long studentId;
    
    private Long homeworkId;
    
    private String homeworkTitle;
    
    private String homeworkContent;
    
    private Date createTime;
    
    private Date updateTime;
}
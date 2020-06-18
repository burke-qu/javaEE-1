package generator;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * s_homework
 * @author 
 */
@Data
public class SHomework implements Serializable {
    private Long id;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
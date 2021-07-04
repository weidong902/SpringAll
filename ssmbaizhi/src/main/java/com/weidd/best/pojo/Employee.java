package com.weidd.best.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-04 22:24
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    //格式化日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date brithday;

    private Long salary;

}

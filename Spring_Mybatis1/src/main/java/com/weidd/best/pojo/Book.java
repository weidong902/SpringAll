package com.weidd.best.pojo;

import lombok.*;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-11 20:09
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造

public class Book {

    private String bname;
    private double bprice;

}

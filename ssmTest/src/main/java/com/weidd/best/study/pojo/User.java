package com.weidd.best.study.pojo;

import lombok.*;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-29 15:40
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long uId;
    private String uName;
    private String uPassword;

}

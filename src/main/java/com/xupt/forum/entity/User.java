package com.xupt.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: forum
 * @author: Semineces
 * @create: 2020-03-30 18:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String vxId;
    private String name;
    private Long phone;
    private String alias;
    private String college;
    private Integer StudentId;
}

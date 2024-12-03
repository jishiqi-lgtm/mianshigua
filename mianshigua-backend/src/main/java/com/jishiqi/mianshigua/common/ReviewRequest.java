package com.jishiqi.mianshigua.common;


import lombok.Data;

import java.io.Serializable;

/**
 * 公共审核请求
 *
 *
 */
@Data
public class ReviewRequest implements Serializable {


    private  Long  id;

    private   Integer reviewStatus;

    private  String reviewMessage;

    private static final long serialVersionUID = 1L;
}

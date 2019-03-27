/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.you.springboot.jwt.modules;


import javax.validation.constraints.NotBlank;

/**
 * 登录表单
 *
 * @author Mark sunlightcs@gmail.com
 */
//@Data
//@ApiModel(value = "登录表单")
public class LoginForm {
    @NotBlank(message="手机号不能为空")
    private String mobile;

    //@ApiModelProperty(value = "密码")
    @NotBlank(message="密码不能为空")
    private String password;

}

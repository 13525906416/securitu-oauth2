package com.zyb.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyb.auth.ehtity.auth.Oauth2BasicUser;
import com.zyb.auth.ehtity.auth.Oauth2ThirdAccount;
import com.zyb.auth.ehtity.result.Oauth2UserinfoResult;

public interface IOauth2BasicUserService  extends IService<Oauth2BasicUser> {
    /**
     * 生成用户信息
     *
     * @param thirdAccount 三方用户信息
     * @return 用户id
     */
    Integer saveByThirdAccount(Oauth2ThirdAccount thirdAccount);

    /**
     * 获取当前登录用户的信息
     *
     * @return 用户信息
     */
    Oauth2UserinfoResult getLoginUserInfo();
}

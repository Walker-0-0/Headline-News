package com.headline.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.headline.model.common.dtos.ResponseResult;
import com.headline.model.user.dtos.LoginDto;
import com.headline.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}

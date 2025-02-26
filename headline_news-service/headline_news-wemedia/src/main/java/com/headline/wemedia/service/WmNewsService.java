package com.headline.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.headline.model.common.dtos.ResponseResult;
import com.headline.model.wemedia.dtos.WmNewsDto;
import com.headline.model.wemedia.dtos.WmNewsPageReqDto;
import com.headline.model.wemedia.pojos.WmNews;

public interface WmNewsService extends IService<WmNews> {

    /**
     * 条件查询文章列表
     * @param dto
     * @return
     */
    public ResponseResult findList(WmNewsPageReqDto dto);

    /**
     * 发布修改文章或保存为草稿
     * @param dto
     * @return
     */
    public ResponseResult submitNews(WmNewsDto dto);

    /**
     * 文章的上下架
     * @param dto
     * @return
     */
    public ResponseResult downOrUp(WmNewsDto dto);


}

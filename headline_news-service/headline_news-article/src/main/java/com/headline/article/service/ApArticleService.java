package com.headline.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.headline.model.article.dtos.ArticleDto;
import com.headline.model.article.dtos.ArticleHomeDto;
import com.headline.model.article.pojos.ApArticle;
import com.headline.model.common.dtos.ResponseResult;

public interface ApArticleService extends IService<ApArticle> {

    /**
     * 根据参数加载文章列表
     * @param loadtype 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    public ResponseResult load(Short loadtype, ArticleHomeDto dto);

    /**
     * 保存app端相关文章
     * @param dto
     * @return
     */
    public ResponseResult saveArticle(ArticleDto dto);


}
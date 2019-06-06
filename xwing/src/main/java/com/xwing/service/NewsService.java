package com.xwing.service;

import com.xwing.pojo.BannerNews;

import java.util.List;

public interface NewsService {
    public List<BannerNews> getLastestNews();
}

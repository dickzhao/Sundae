package com.xwing.service.serviceImpl;

import com.xwing.common.utils.DateUtils;
import com.xwing.dao.daoImpl.NewsDao;
import com.xwing.pojo.BannerNews;
import com.xwing.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<BannerNews> getLastestNews() {

        List<BannerNews> newsList=newsDao.getWeekNews(DateUtils.getBeginDayOfWeek(),DateUtils.getEndDayOfWeek());
        return newsList;
    }
}

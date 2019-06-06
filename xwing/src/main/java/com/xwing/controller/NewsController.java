package com.xwing.controller;

import com.xwing.common.utils.ReturnResult;
import com.xwing.pojo.BannerNews;
import com.xwing.pojo.Image;
import com.xwing.service.NewsService;
import com.xwing.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "/getLastestNews",method = RequestMethod.GET)
    public ReturnResult getLastestNews(){
        List<BannerNews> newsList=newsService.getLastestNews();
        List<Image> imageList=pictureService.getAllImagesByType(3);
        Map resultMap=new HashMap<Object,Object>();
        ArrayList list = new ArrayList<>();
        for(int i=0;i<newsList.size();i++){
            for (int j=0;j<imageList.size();j++){
                if(newsList.get(i).getImageId().equals(imageList.get(j).getId())){
                    Image image=new Image();
                    image=imageList.get(j);
                    newsList.get(i).setImage(image);
                    break;
                }
            }
            list.add(newsList.get(i));
        }
        return ReturnResult.build(200,"success",list);
    }
}

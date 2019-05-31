package com.xwin.controller;

import com.xwin.common.utils.JsonUtils;
import com.xwin.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping(value = "/image")
public class ImageController {

    @Autowired
    private PictureService pictureService;

    //图片上传方法
    @RequestMapping(value = "/upload/img")
    @ResponseBody
    public String updateImage(@PathVariable MultipartFile uploadFile){
        Map result=pictureService.uploadPicture(uploadFile);
        //为了保证浏览器兼容性，需要将result转换成json格式的字符串
        String json= JsonUtils.objectToJson(result);
        return json;
    }
}

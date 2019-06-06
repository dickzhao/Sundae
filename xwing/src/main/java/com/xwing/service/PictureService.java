package com.xwing.service;

import com.xwing.pojo.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface PictureService {

	Map uploadPicture(MultipartFile uploadFile);

	public List<Image> getAllImagesByType(long type);
}

package com.example.yesim_spring.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ImageURL {

    public static String BASE_URL = "";
    public static String UPLOAD_URL = "";


    @Value("${image-base-url}")
    private void setUploadPath(String url) {
        UPLOAD_URL = url.replace("file:///", "");;
    }

    @Value("${file.upload-dir}")
    private String uploadDir;

    public String getFilePath(String fileName) {
        return System.getProperty("user.dir") + "/" + uploadDir + fileName;
    }

    @Value("${image-base-url}")
    public void setBaseUrl(String url){
        BASE_URL = url;
    }

    public static String thumbnail(String imgName) {


        return BASE_URL + imgName;
//        return BASE_URL + "image/" + imgName;
//        return BASE_URL + UPLOAD_URL + imgName;
    }
}

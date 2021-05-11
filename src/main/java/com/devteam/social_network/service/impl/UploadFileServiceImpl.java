package com.devteam.social_network.service.impl;

import com.devteam.social_network.common.exception.AppException;
import com.devteam.social_network.service.UploadFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Override
    public String uploadFile(MultipartFile[] multipartFileList) {
        for (int i = 0 ; i < multipartFileList.length ; i++){
            if (multipartFileList[i].isEmpty()){
                throw new AppException("APIUF","file not empty");
            }
        }

        Path path = Paths.get("upload/");
        for (int i = 0 ; i < multipartFileList.length ; i++){
            try {
                InputStream inputStream = multipartFileList[i].getInputStream();
                Files.copy(inputStream,path.resolve(multipartFileList[i].getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new AppException("APIUL2","Can't upload");
            }
        }
        return "upload/";
    }
}

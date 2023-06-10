package com.example.REST.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploader {
    public final String upload_Dir="C:\\Users\\Guest007\\Downloads\\boot\\REST\\REST\\src\\main\\resources\\static\\images";
    public boolean uploadFile(MultipartFile multipartFile) throws IOException {
//        boolean flag=false;
//        try {
//           InputStream inputStream= multipartFile.getInputStream();
//           byte data[]=new byte[inputStream.available()];
//           inputStream.read(data);
//
//           //write
//            FileOutputStream fileOutputStream=new FileOutputStream(upload_Dir+"\\"+multipartFile.getOriginalFilename());
//            fileOutputStream.write(data);
//            fileOutputStream.flush();
//            fileOutputStream.close();
//            flag=true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return flag;

        //Another method
        Files.copy(multipartFile.getInputStream(), Paths.get(upload_Dir+"\\"+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        return true;
    }
}

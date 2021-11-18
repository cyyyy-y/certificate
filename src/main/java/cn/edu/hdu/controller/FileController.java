package cn.edu.hdu.controller;

import cn.edu.hdu.listener.OrderDataListener;
import cn.edu.hdu.mapper.FileMapper;
import cn.edu.hdu.model.File;
import cn.edu.hdu.service.FileService;
import com.alibaba.excel.EasyExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileMapper fileMapper;
    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public String excelImport(@RequestParam("file")MultipartFile file) {
        try {
            System.out.println (file.getInputStream ());

            EasyExcel.read(file.getInputStream(), cn.edu.hdu.model.File.class,
                    new OrderDataListener(fileMapper)).sheet().doRead();

        }catch (Exception e){
            e.printStackTrace ();
        }
        return "success";
    }

    @GetMapping("/selectAll")
    public List<File> selectAdmins() {
        return this.fileMapper.selectAll ();
    }

}

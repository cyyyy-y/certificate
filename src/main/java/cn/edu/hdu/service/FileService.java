package cn.edu.hdu.service;

import cn.edu.hdu.mapper.FileMapper;
import cn.edu.hdu.mapper.UserMapper;
import cn.edu.hdu.model.File;
import cn.edu.hdu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    @Autowired
    private FileMapper fileMapper;

    /***查询用户*/
    public List<File> selectAll() {
        return this.fileMapper.selectAll ();
    }

}


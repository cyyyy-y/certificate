package cn.edu.hdu.mapper;

import cn.edu.hdu.model.File;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FileMapper {
    public void addOrdersByList ( List<File> file );
    public List<File> selectAll();
}

package cn.edu.hdu.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

@Data
public class File {
    @ExcelProperty("序号")
    private String fileId;//序号

    @ExcelProperty("作品编号")
    private String number;//作品编号

    @ExcelProperty("省赛获奖")
    private String award;//省赛获奖

    @ExcelProperty("作品名称")
    private String name;//作品名称

    @ExcelProperty("参赛学校")
    private String school;//参赛学校

    @ExcelProperty("作品类别")
    private String category;//作品类别

    @ExcelProperty("作品子类别")
    private String subcategory;//作品子类别

    @ExcelProperty("作者1")
    private String author1;//作者1

    @ExcelProperty("作者2")
    private String author2;//作者2

    @ExcelProperty("作者3")
    private String author3;//作者3

    @ExcelProperty("作者4")
    private String author4;//作者4

    @ExcelProperty("作者5")
    private String author5;//作者5

    @ExcelProperty("指导教师1")
    private String teacher1;//指导老师1

    @ExcelProperty("指导教师2")
    private String teacher2;//指导老师2

    @ExcelIgnore
    private Date createTime;

    public String getFileId () {
        return fileId;
    }

    public void setFileId ( String fileId ) {
        this.fileId = fileId;
    }

    public String getNumber () {
        return number;
    }

    public void setNumber ( String number ) {
        this.number = number;
    }

    public String getAward () {
        return award;
    }

    public void setAward ( String award ) {
        this.award = award;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getSchool () {
        return school;
    }

    public void setSchool ( String school ) {
        this.school = school;
    }

    public String getCategory () {
        return category;
    }

    public void setCategory ( String category ) {
        this.category = category;
    }

    public String getSubcategory () {
        return subcategory;
    }

    public void setSubcategory ( String subcategory ) {
        this.subcategory = subcategory;
    }

    public String getAuthor1 () {
        return author1;
    }

    public void setAuthor1 ( String author1 ) {
        this.author1 = author1;
    }

    public String getAuthor2 () {
        return author2;
    }

    public void setAuthor2 ( String author2 ) {
        this.author2 = author2;
    }

    public String getAuthor3 () {
        return author3;
    }

    public void setAuthor3 ( String author3 ) {
        this.author3 = author3;
    }

    public String getAuthor4 () {
        return author4;
    }

    public void setAuthor4 ( String author4 ) {
        this.author4 = author4;
    }

    public String getAuthor5 () {
        return author5;
    }

    public void setAuthor5 ( String author5 ) {
        this.author5 = author5;
    }

    public String getTeacher1 () {
        return teacher1;
    }

    public void setTeacher1 ( String teacher1 ) {
        this.teacher1 = teacher1;
    }

    public String getTeacher2 () {
        return teacher2;
    }

    public void setTeacher2 ( String teacher2 ) {
        this.teacher2 = teacher2;
    }

    @Override
    public String toString () {
        return "File{" +
                "fileId='" + fileId + '\'' +
                ", number='" + number + '\'' +
                ", award='" + award + '\'' +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", author1='" + author1 + '\'' +
                ", author2='" + author2 + '\'' +
                ", author3='" + author3 + '\'' +
                ", author4='" + author4 + '\'' +
                ", author5='" + author5 + '\'' +
                ", teacher1='" + teacher1 + '\'' +
                ", teacher2='" + teacher2 + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public void setCreateTime ( Date date ) {
//        System.out.println (fileId+"/"+author1+"/"+author2+"/"+author3+"/"+author4+"/"+author5+"/"+teacher1+"/"+teacher2);
//        System.out.println ("setCreateTime");
    }
}


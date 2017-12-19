package com.xiaodanhuang.controller;
import com.xiaodanhuang.entity.Course;
import com.xiaodanhuang.entity.Chapter;
import com.xiaodanhuang.entity.courseware;
import com.xiaodanhuang.entity.homework;
import com.xiaodanhuang.service.DbTeacher;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;


@Controller

public class UploadController {
    @Autowired
    DbTeacher dbTeacher;
    //课件上传代码
    @RequestMapping(value = "api/upLoadFile", method = RequestMethod.POST)
    @ResponseBody
    public List<courseware> upload(HttpServletRequest reques,MultipartFile file,HttpServletRequest request) throws IOException{
        String src = request.getSession().getServletContext().getRealPath("upload");
        src=src.replace("/target/EazyJava","");
        int chapterId=Integer.parseInt(reques.getParameter("chapterId"));
        String filename = reques.getParameter("chapterId")+file.getOriginalFilename();
        int  teacher= dbTeacher.teacherFileAdd(chapterId,"sadf",filename);
        File dir = new File(src,filename);
        if(!dir.exists()){
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);
        List<courseware>wareList=dbTeacher.teacherByCourseWare(chapterId);
        return wareList;
    }
    //课件下载代码
    @RequestMapping("api/downLoad")
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{
        String  filename=request.getParameter("filename");
        String fileName  = request.getSession().getServletContext().getRealPath("upload")+"/"+filename;
        fileName=fileName.replace("/target/EazyJava","");
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));

        // 设置响应头，控制浏览器下载该文件
                response.setHeader("content-disposition", "attachment;filename="
                + URLEncoder.encode(filename, "UTF-8"));

        response.setContentType("multipart/form-data");

        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
    //课件删除代码
    @RequestMapping("api/delete")
    @ResponseBody
    public  List<courseware> deleteFile(HttpServletRequest request) {
        Boolean flag = false;
        String  filename=request.getParameter("filename");
        int chapterId=Integer.parseInt(request.getParameter("chapterId"));
        int id=Integer.parseInt(request.getParameter("id"));
        String fileName  = request.getSession().getServletContext().getRealPath("upload")+"/"+filename;
        fileName=fileName.replace("/target/EazyJava","");
        File file = new File(fileName );
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        int up =dbTeacher.teacherWareDelete(id);
        List<courseware>wareList=dbTeacher.teacherByCourseWare(chapterId);
        return wareList;
    }
    //课件上传代码
    @RequestMapping(value = "api/upLoadWork", method = RequestMethod.POST)
    @ResponseBody public List<homework> uploadhome(HttpServletRequest reques,MultipartFile file,HttpServletRequest request) throws IOException{
        String src = request.getSession().getServletContext().getRealPath("uploadWork");
        src=src.replace("/target/EazyJava","");
        int chapterId=Integer.parseInt(reques.getParameter("courseId"));
        String workName=reques.getParameter("workName");
        int teacherNum=Integer.parseInt(reques.getParameter("teacherNum"));
        String filename = reques.getParameter("courseId")+file.getOriginalFilename();
        File dir = new File(src,filename);
        if(!dir.exists()){
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);
        int  teacher= dbTeacher.teacherWorkAdd(chapterId,filename, workName);
        List<homework>homework=dbTeacher.teacherByWork(teacherNum);
        return homework;
    }
    //作业下载代码
    @RequestMapping("api/homeDownLoad")
    public void homedown(HttpServletRequest request,HttpServletResponse response) throws Exception{
        String  filename=request.getParameter("filename");
        String fileName  = request.getSession().getServletContext().getRealPath("uploadWork")+"/"+filename;
        fileName=fileName.replace("/target/EazyJava","");
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));

        // 设置响应头，控制浏览器下载该文件
        response.setHeader("content-disposition", "attachment;filename="
                + URLEncoder.encode(filename, "UTF-8"));

        response.setContentType("multipart/form-data");

        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        out.close();
    }
    //课件删除
    @RequestMapping("api/workDelete")
    @ResponseBody
    public  List<homework> workDelete(HttpServletRequest request) {
        Boolean flag = false;
        String  filename=request.getParameter("filename");
        int teacherNum=Integer.parseInt(request.getParameter("teacherNum"));
        int id=Integer.parseInt(request.getParameter("id"));
        String fileName  = request.getSession().getServletContext().getRealPath("uploadWork")+"/"+filename;
        fileName=fileName.replace("/target/EazyJava","");
        File file = new File(fileName );
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        int up =dbTeacher.teacherWorkDelete(id);
        List<homework>homework=dbTeacher.teacherByWork(teacherNum);
        return homework;
    }


}


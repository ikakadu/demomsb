package com.lkl.demomsb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class FileController {

    @GetMapping("/down")
    public String  fileDownload(HttpServletRequest req, HttpServletResponse res) throws IOException {
        File file = new File("E://t_card_bin.sql");
        String fileName = file.getName();

        res.setContentType("application/x-msdownload;charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
        res.setHeader("Pragma", "public");
        res.setHeader("Cache-Control", "max-age=30");
        res.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        res.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));



//        InputStream in = new FileInputStream(file);

        BufferedInputStream  in = new BufferedInputStream (new FileInputStream(file));
        //输出流
        OutputStream out = res.getOutputStream();
        //输出文件
        int bytes = 0;
        byte[] bufferOut = new byte[1024];
        while ((bytes = in.read(bufferOut)) != -1) {
            out.write(bufferOut, 0, bytes);

        }



        out.flush();
        out.close();
        in.close();

        return "下载成功";
    }

}

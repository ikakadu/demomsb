package com.lkl.demomsb.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.LineSeparator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
public class PdfCreate1 {
    // main测试
    public static void main(String[] args) throws Exception {

    }
    @GetMapping(value = "/pdf")
    private  void pdf( HttpServletResponse response) throws DocumentException, IOException {
        //1，创建文档对象
        Document document = new Document();
        //2，监听输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PdfWriter.getInstance(document, baos);
        //3，打开文档
                document.open();
        //4，添加文本
                document.add(new Paragraph("pdf渲染好的文本"));
        //5，关闭文档
                document.close();

        //6，设置请求返回类型
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=onetouchExchangeAccount.pdf");
        response.setContentLength(baos.size());
        OutputStream out = response.getOutputStream();
        baos.writeTo(out);
        out.flush();
        out.close();
    }


}

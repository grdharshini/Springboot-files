package com.example.pdfgenerator.controller;

import com.example.pdfgenerator.service.PDFService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class PDFController {
    private final PDFService pdfService;

    public PDFController(PDFService pdfService) {
        this.pdfService = pdfService;
    }
    @GetMapping("/pdf/generate")
    private void generatePdf(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormat.format(new Date());

        String headerKey ="Content-disposition";
        String headerValue = "attachment;filename=pdf_"+currentDateTime+".pdf";
        httpServletResponse.setHeader(headerKey,headerValue);

        this.pdfService.export(httpServletResponse);
    }
}

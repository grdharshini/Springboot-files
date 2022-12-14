package com.fileuploadanddownload.fileuploading.controller;

import com.fileuploadanddownload.fileuploading.ResponseData;
import com.fileuploadanddownload.fileuploading.entity.Attachment;
import com.fileuploadanddownload.fileuploading.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }
    @PostMapping("/uploadFile")
    public ResponseData uploadFile(@RequestParam("file")MultipartFile file) throws Exception {
        Attachment attachment=null;
        String downloadURL="";
        attachment= attachmentService.saveAttachment(file);
        downloadURL  = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/download/")
                        .path(attachment.getId())
                        .toUriString();
      return new ResponseData(attachment.getFileName(),
              downloadURL,
              file.getContentType(),
              file.getSize());
    }

    @GetMapping("/download/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) throws Exception{
        Attachment attachment =null;
        attachment = (Attachment) attachmentService.getAttachment(fileId);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(attachment.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;fileName =\""+attachment.getFileName()
                +"\"").body(new ByteArrayResource(attachment.getData()));
    }

}

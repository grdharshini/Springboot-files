package com.fileuploadanddownload.fileuploading.service;

import com.fileuploadanddownload.fileuploading.ResponseData;
import com.fileuploadanddownload.fileuploading.entity.Attachment;
import com.fileuploadanddownload.fileuploading.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface AttachmentService {

    Attachment saveAttachment(MultipartFile file) throws Exception ;



    Attachment getAttachment(String fileId) throws Exception ;

        }


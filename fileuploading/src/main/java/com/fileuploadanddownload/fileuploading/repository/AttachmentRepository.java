package com.fileuploadanddownload.fileuploading.repository;

import com.fileuploadanddownload.fileuploading.ResponseData;
import com.fileuploadanddownload.fileuploading.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,String> {


}

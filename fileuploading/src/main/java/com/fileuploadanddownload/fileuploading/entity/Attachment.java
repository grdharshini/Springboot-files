package com.fileuploadanddownload.fileuploading.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name ="uuid",strategy ="uuid2" )
	private String id;
	private String fileName;
	private String fileType;
	@Lob
	private byte[]data;

	public Attachment(String fileName, String contentType, byte[] bytes) {
		this.fileName=fileName;
		this.fileType=fileType;
		this.data=data;
	}
}

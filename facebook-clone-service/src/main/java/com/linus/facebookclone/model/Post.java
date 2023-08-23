package com.linus.facebookclone.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private String id;
    private String post;
    private String email;
    private String name;
    private String image;
    private String file;
    private String profilePic;
    private String timeStamp;
    private String imageName;
}

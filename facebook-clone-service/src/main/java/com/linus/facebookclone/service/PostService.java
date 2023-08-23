package com.linus.facebookclone.service;

import com.linus.facebookclone.model.Post;

import java.util.List;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}

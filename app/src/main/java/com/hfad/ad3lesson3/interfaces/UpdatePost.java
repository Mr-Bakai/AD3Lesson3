package com.hfad.ad3lesson3.interfaces;

import com.hfad.ad3lesson3.data.model.Post;

public interface UpdatePost {
    void onSuccess(Post post);
    void onFailure(String error);
}

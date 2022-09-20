package com.wonblog.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class PostCreate {

    public String title;
    public String content;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostCreate{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

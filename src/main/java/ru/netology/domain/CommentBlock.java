package ru.netology.domain;

public class CommentBlock {
    public int fromId; //id автора коммента
    public String text; //текст комментария
    public int repleyPostId; //id на чей пост ответ

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRepleyPostId() {
        return repleyPostId;
    }

    public void setRepleyPostId(int repleyPostId) {
        this.repleyPostId = repleyPostId;
    }
}

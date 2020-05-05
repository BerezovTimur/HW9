package ru.netology.domain;

public class Post {
    private int id;
    private String text;
    private int date;
    private int ownerId;
    private int fromId;
    private int friendsOnly;
    private int createdBy;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private Like like;
    private Comment comment;
    private CommentBlock commentBlock;
    private HeadLogo headLogo;
    private Image image;
    private LookCounter lookCounter;
    private PopUp popUp;
    private Repost repost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public CommentBlock getCommentBlock() {
        return commentBlock;
    }

    public void setCommentBlock(CommentBlock commentBlock) {
        this.commentBlock = commentBlock;
    }

    public HeadLogo getHeadLogo() {
        return headLogo;
    }

    public void setHeadLogo(HeadLogo headLogo) {
        this.headLogo = headLogo;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public LookCounter getLookCounter() {
        return lookCounter;
    }

    public void setLookCounter(LookCounter lookCounter) {
        this.lookCounter = lookCounter;
    }

    public PopUp getPopUp() {
        return popUp;
    }

    public void setPopUp(PopUp popUp) {
        this.popUp = popUp;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }
}

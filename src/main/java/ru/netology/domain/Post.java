package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int authorId;
    private int createdBy;
    private String date;
    private String text;
    private String postType;
    private boolean onlyForFriends;
    private boolean canDelete;
    private boolean canPinPost;
    private boolean canPinned;
    private boolean canEdit;
    private boolean doesItContainAds;
    private boolean addToBookmark;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Сopyright copyright;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public boolean isOnlyForFriends() {
        return onlyForFriends;
    }

    public void setOnlyForFriends(boolean onlyForFriends) {
        this.onlyForFriends = onlyForFriends;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanPinPost() {
        return canPinPost;
    }

    public void setCanPinPost(boolean canPinPost) {
        this.canPinPost = canPinPost;
    }

    public boolean isCanPinned() {
        return canPinned;
    }

    public void setCanPinned(boolean canPinned) {
        this.canPinned = canPinned;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isDoesItContainAds() {
        return doesItContainAds;
    }

    public void setDoesItContainAds(boolean doesItContainAds) {
        this.doesItContainAds = doesItContainAds;
    }

    public boolean isAddToBookmark() {
        return addToBookmark;
    }

    public void setAddToBookmark(boolean addToBookmark) {
        this.addToBookmark = addToBookmark;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public Сopyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Сopyright copyright) {
        this.copyright = copyright;
    }
}

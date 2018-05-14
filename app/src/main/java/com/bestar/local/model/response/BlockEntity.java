package com.bestar.local.model.response;

import java.io.Serializable;
import java.util.ArrayList;

public class BlockEntity implements Serializable {

    private String icon;
    private String title;
    private String foundId;
    private String commentnum;
    private String content;
    private String faceimage;
    private String nickname;
    private String voiceAuthentication;
    private String praisenum;
    private String userId;
    private String createtime;
    private int isreport;
    private int ispraise;
    private String dist;
    private String mediaUrl;
    private String link;
    private String location;
    private int state;
    private int mediaType;
    private int isAd = 1;
    private int type;//1 普通 2 论坛 3 技能
    private int voiceAuthenticationSecond;//语音时长
    //技能分享
    private String skillImage;
    private String skillTitle;
    private String skillId;
    private String skillContent;
    private String homeImage;
    private String homeTitle;
    private String homeId;
    private String homeContent;
    private int skillType;
    private ArrayList<Image> image_list;
    private ArrayList<Praise> praise_list;
    private ArrayList<Comment> comment_list;

    public int getVoiceAuthenticationSecond() {
        return voiceAuthenticationSecond;
    }

    public void setVoiceAuthenticationSecond(int voiceAuthenticationSecond) {
        this.voiceAuthenticationSecond = voiceAuthenticationSecond;
    }

    public String getVoiceAuthentication() {
        return voiceAuthentication;
    }

    public void setVoiceAuthentication(String voiceAuthentication) {
        this.voiceAuthentication = voiceAuthentication;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFoundId() {
        return foundId;
    }

    public void setFoundId(String foundId) {
        this.foundId = foundId;
    }

    public String getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(String commentnum) {
        this.commentnum = commentnum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFaceimage() {
        return faceimage;
    }

    public void setFaceimage(String faceimage) {
        this.faceimage = faceimage;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(String praisenum) {
        this.praisenum = praisenum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getIsreport() {
        return isreport;
    }

    public void setIsreport(int isreport) {
        this.isreport = isreport;
    }

    public int getIspraise() {
        return ispraise;
    }

    public void setIspraise(int ispraise) {
        this.ispraise = ispraise;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public int getIsAd() {
        return isAd;
    }

    public void setIsAd(int isAd) {
        this.isAd = isAd;
    }

    public ArrayList<Image> getImage_list() {
        return image_list;
    }

    public void setImage_list(ArrayList<Image> image_list) {
        this.image_list = image_list;
    }

    public ArrayList<Praise> getPraise_list() {
        return praise_list;
    }

    public void setPraise_list(ArrayList<Praise> praise_list) {
        this.praise_list = praise_list;
    }

    public ArrayList<Comment> getComment_list() {
        return comment_list;
    }

    public void setComment_list(ArrayList<Comment> comment_list) {
        this.comment_list = comment_list;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSkillImage() {
        return skillImage;
    }

    public void setSkillImage(String skillImage) {
        this.skillImage = skillImage;
    }

    public String getSkillTitle() {
        return skillTitle;
    }

    public void setSkillTitle(String skillTitle) {
        this.skillTitle = skillTitle;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getSkillContent() {
        return skillContent;
    }

    public void setSkillContent(String skillContent) {
        this.skillContent = skillContent;
    }

    public int getSkillType() {
        return skillType;
    }

    public void setSkillType(int skillType) {
        this.skillType = skillType;
    }

    public String getHomeImage() {
        return homeImage;
    }

    public void setHomeImage(String homeImage) {
        this.homeImage = homeImage;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getHomeContent() {
        return homeContent;
    }

    public void setHomeContent(String homeContent) {
        this.homeContent = homeContent;
    }
}

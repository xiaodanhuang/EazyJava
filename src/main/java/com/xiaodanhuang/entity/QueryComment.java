package com.xiaodanhuang.entity;
import com.xiaodanhuang.entity.Guest;
import java.util.List;

public class QueryComment
{
    private int id;
    private int hostId;
    private String username;
    private String avater;
    private String comment;
    private String commentTime;
    private List<Guest> guestlist;

    public List<Guest> getGuestlist() {
        return guestlist;
    }

    public void setGuestlist(List<Guest> guestlist) {
        this.guestlist = guestlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }
}

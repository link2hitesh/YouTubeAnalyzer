package models;

public class channelvideolist {


    public String Date;
    public String title;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public channelvideolist(String title,String date) {
        Date = date;
        this.title = title;
    }
}

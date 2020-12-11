package models;


/**
 * skeleton structure for storing the value
 * @author ankur aggarwal
 */
public class channelvideolist {


    public String Date;
    public String title;

    /**
     * Getter for the Date
     * @return  Date
     */
    public String getDate() {
        return Date;
    }
    /**
     * Setter for the Date
     */
    public void setDate(String date) {
        Date = date;
    }
    /**
     * Setter for the title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Getter for the Title
     * @return  title
     */

    public String getTitle() {
        return title;
    }
    /**
     *constructor
     */

    public channelvideolist(String title,String date) {
        Date = date;
        this.title = title;
    }
}

package models;
/**
 * Get its values from the search api @see Searchcontroller
 *
 * @author hitesh agarwal
 */
public class Data {

    public String author;
    public String title;
    public String viewcount;
    public String posted;
    public String chid;
    

    /**
     *channel Id of the video
     * @return  channel Id
     */

    public String getChid() {
        return chid;
    }
    /**
     * set channel Id of the video
     */

    public void setChid(String chid) {
        this.chid = chid;
    }
    /**
     * number of views on video
     * @return  viewcount
     */


    public String getViewcount() {
        return viewcount;
    }
    /**
     * set number of views on video
     */
    public void setViewcount(String viewcount) {
        this.viewcount = viewcount;
    }
    /**
     *vedio upload date
     * @return  posted
     */


    public String getPosted() {
        return posted;
    }


    /**
     *  constructor for class Data
     * @param author is owner of the youtube channel
     * @param  title of the vedio searched
     * @param viewcount number of views on video
     * @param posted vedio upload date
     * @param chid channel Id of the video
     */

    public Data(String author, String title, String viewcount, String posted,String chid) {
        this.author = author;
        this.title = title;
        this.viewcount = viewcount;
        this.posted = posted;
        this.chid = chid;
    }

    /**
     * set vedio upload date
     */
    public void setPosted(String posted) {
        this.posted = posted;
    }
    /**
     *owner of the youtube channel
     * @return  author
     */


    public String getAuthor() {
        return author;
    }

    /**
     * Set owner of the youtube channel
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * set title of the vedio searched
     */


    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * title of the vedio searched
     * @return  title
     */

    public String getTitle() {
        return title;
    }

  
}

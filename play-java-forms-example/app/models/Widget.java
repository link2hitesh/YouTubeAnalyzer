package models;

/**
 * Presentation object used for displaying data in a template.
 *
 * Note that it's a good practice to keep the presentation DTO,
 * which are used for reads, distinct from the form processing DTO,
 * which are used for writes.
 * @author ankuraggarwal
 */
public class Widget {
    public String name;

    /**
     * constructor
     * @param name
     */
    public Widget(String name) {
        this.name = name;

    }
}

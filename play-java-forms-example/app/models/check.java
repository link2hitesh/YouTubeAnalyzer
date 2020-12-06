package models;

import java.util.List;
/**
 * Get its values from the search api @see WidgetController
 * @author hitesh Agarwal
 * @author ankuraggarwal
 */
public class check {

    public check(List<check> datavalue) {
    }

    /**
     *  return the query to be searched
     * @return  Value
     */

    public String getValue() {
        return Value;
    }

    /**
     * set the query to be searched
     */
    public void setValue(String value) {
        Value = value;
    }
    /**
     * set the List of type Data
     */

    public void setValue2(List<Data> value2) {
        this.value2 = value2;
    }

    /**
     * return the List of type Data
     * @return  Value2
     */
    public List<Data> getValue2() {
        return value2;
    }

    public String Value;
    /**
     *  constructor for class check
     * @param value the query to be searched
     * @param value2 the List of type Data

     */

    public check(String value, List<Data> value2) {
        Value = value;
        this.value2 = value2;
    }

    public List<Data> value2;
}

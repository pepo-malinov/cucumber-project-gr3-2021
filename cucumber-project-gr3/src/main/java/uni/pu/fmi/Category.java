package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Category {

    /**
     * Default constructor
     */
    public Category() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public Set<Item> items;

    /**
     * 
     */
    public Set<Category> children;

    /**
     * 
     */
    public Category parent;

}
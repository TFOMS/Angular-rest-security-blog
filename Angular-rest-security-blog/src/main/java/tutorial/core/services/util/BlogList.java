package tutorial.core.services.util;


import java.util.ArrayList;
import java.util.List;

import tutorial.core.entity.Blog;

/**
 * Created by Chris on 7/1/14.
 */
public class BlogList {

    private List<Blog> blogs = new ArrayList<Blog>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}

package tutorial.core.repositories;

import tutorial.core.entity.Account;
import tutorial.core.entity.Blog;


/**
 * Created by Chris on 7/9/14.
 */
public interface AccountRepo {
    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
}

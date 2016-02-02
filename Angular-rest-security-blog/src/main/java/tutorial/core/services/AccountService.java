package tutorial.core.services;

import tutorial.core.entity.Account;
import tutorial.core.entity.Blog;


/**
 * Created by Chris on 6/28/14.
 */
public interface AccountService {
    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
}

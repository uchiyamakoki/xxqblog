package ssm.blog.dao;

import org.springframework.stereotype.Repository;
import ssm.blog.entity.Blogger;

@Repository //注册为持久层的bean
public interface BloggerDao {
    /*
    查询博主信息
     */
    Blogger getBloggerData();
}

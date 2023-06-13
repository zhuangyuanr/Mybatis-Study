package dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.apache.log4j.Logger;


public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserById(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);//
            System.out.println(user);//
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void log4jTest(){
        logger.info("info日志");
        logger.debug("debug日志");
        logger.error("error日志");
    }

}
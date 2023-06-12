package dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {


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


}
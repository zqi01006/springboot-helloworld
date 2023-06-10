package com.zqi;

import com.zqi.domain.User;
import com.zqi.mapper.UserMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TestClass {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testFindAll() {

        List<User> all = userMapper.findAll();
        System.out.println(all);

    }
}

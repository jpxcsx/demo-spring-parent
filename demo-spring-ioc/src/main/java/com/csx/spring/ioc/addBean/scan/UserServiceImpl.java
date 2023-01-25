package com.csx.spring.ioc.scan;

import org.springframework.stereotype.Service;

/**
 * 以下注解功能相同，但逻辑上区分
 * <p> 1. {@link org.springframework.stereotype.Controller} 一般标注在Controller层
 * <p> 2. {@link Service} 一般标注在 Service层
 * <p> 3. {@link org.springframework.stereotype.Repository} 一般标注在Dao层
 * <p> 4. {@link org.springframework.stereotype.Component} 一般标注在其它组件上
 * @author cuisongxu
 * @date 2023/1/24 12:17
 */
@Service
public class UserServiceImpl implements UserService{
}

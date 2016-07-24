package io.khasang.qb.config;

import io.khasang.utask.dao.*;
import io.khasang.utask.dao.impl.*;
import io.khasang.utask.model.*;
import io.khasang.utask.service.points.PointService;
import io.khasang.utask.service.points.PointServiceImpl;
import io.khasang.utask.service.tasks.TaskService;
import io.khasang.utask.service.tasks.TaskServiceImpl;
import io.khasang.utask.service.users.UserService;
import io.khasang.utask.service.users.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

@Configuration
@PropertySource("classpath:util.properties")
@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {

    @Autowired
    Environment environment;

    @Autowired
    HibernateConfig hibernateConfig;

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(hibernateConfig.dataSource());
        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
        return jdbcImpl;
    }

    @Bean
    public BackupDB backupDB() {
        return new BackupDbOverProcessBuilder();
    }

    @Bean
    public UserDAO userDAO() {
        return new UserDAOImpl();
    }

    @Bean
    public TaskDAO taskDAO() {
        return new TaskDAOImpl();
    }

    @Bean
    public NewsDao newDao() {
        return new NewsDaoImpl();
    }

    @Bean
    RolesDao roleDao() {
        return new RolesDaoImpl();
    }

    @Bean
    UserRoleDao userRolesDao() {
        return new UserRolesDaoImpl();
    }

    @Bean
    TaskService taskService() {
        return new TaskServiceImpl();
    }

    @Bean
    UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    PointService pointService() {
        return new PointServiceImpl();
    }

    @Bean
    PointDao pointDao() {
        return new PointDaoImpl();
    }

}
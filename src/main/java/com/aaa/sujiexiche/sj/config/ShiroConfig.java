package com.aaa.sujiexiche.sj.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    //配置userRealm类
    @Bean(name = "userRealm")
    public UserRealm getUserRealm(){
        UserRealm userRealm=new UserRealm();
        return userRealm;
    }
    //配置securityManager类并注入userRealm
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;

    }
    //配置ShiroFilterFactoryBean类并注入securityManager
@Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean =new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> filtermap=new LinkedHashMap<>();
        //直接访问
        filtermap.put("/Login","anon");

        //认证成功访问
        filtermap.put("/success","authc");
        filtermap.put("/page/*","authc");
        //认证成功并授权才能访问
        filtermap.put("/findGl","perms[/findGl]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        return  shiroFilterFactoryBean;
    }

         @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }
}

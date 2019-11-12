package com.aaa.sujiexiche.sj.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro配置
 *
 * **/
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
        //添加shiro内置过滤器
        /*
         * anon:表示可以匿名使用。
           authc:表示需要认证(登录)才能使用，没有参数
           roles：参数可以写多个，多个时必须加上引号，并且参数之间用逗号分割，当有多个参数时，例如admins/user/**=roles["admin,guest"],每个参数通过才算通过，相当于hasAllRoles()方法。
           perms：参数可以写多个，多个时必须加上引号，并且参数之间用逗号分割，例如/admins/user/**=perms["user:add:*,user:modify:*"]，当有多个参数时必须每个参数都通过才通过，想当于isPermitedAll()方法。
           rest：根据请求的方法，相当于/admins/user/**=perms[user:method] ,其中method为post，get，delete等。
           port：当请求的url的端口不是8081是跳转到schemal://serverName:8081?queryString,其中schmal是协议http或https等，serverName是你访问的host,8081是url配置里port的端口，queryString是你访问的url里的？后面的参数。
           authcBasic：没有参数表示httpBasic认证
           ssl:表示安全的url请求，协议为https
           user:当登入操作时不做检查
         */
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> filtermap=new LinkedHashMap<>();
        //直接访问
        filtermap.put("/Login","anon");
        //设置不拦截静态资源
        filtermap.put("/css/**","anon");
        filtermap.put("/js/**","anon");
        filtermap.put("/layui/**","anon");
        filtermap.put("/upload/**","anon");
        //设置拦截所有
        //认证成功访问
        filtermap.put("/success","authc");
        filtermap.put("/page/*","authc");
        //认证成功并授权才能访问
        /*filtermap.put("/findGl","perms[/findGl]");*/
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filtermap);
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        //没有权限时跳转noAuth页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/index");
        return  shiroFilterFactoryBean;
    }

    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }

}

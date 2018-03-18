package com.fixed.asset.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.fixed.asset.service.CustomUserDetailService;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
    UserDetailsService customUserService(){ //注册UserDetailsService 的bean
        return new CustomUserDetailService();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()); //user Details Service验证
        
    }
    
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
		http.headers().frameOptions().disable();
		http.csrf().disable();

		http.authorizeRequests()
			.anyRequest().authenticated()
			.and().formLogin().loginPage("/login")
				// 设置默认登录成功跳转页面
				.defaultSuccessUrl("/home.html").failureUrl("/login?error").permitAll()
			.and()
				// 开启cookie保存用户数据
				.rememberMe()
				// 设置cookie有效期
				.tokenValiditySeconds(60 * 60 * 24 * 7)
				// 设置cookie的私钥
				.key("fixed")
			.and().logout()
				// 默认注销行为为logout，可以通过下面的方式来修改
				.logoutUrl("/logout")
				// 设置注销成功后跳转页面，默认是跳转到登录页面
				.logoutSuccessUrl("/login")
				.permitAll();
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/static/**");
        web.ignoring().antMatchers("/ALTE/**");
        web.ignoring().antMatchers("/common/**");
    }
}

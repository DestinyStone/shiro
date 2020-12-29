package com.test.test005.shiro.realm;


import com.test.test005.shiro.token.JWTToken;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Auther: ASUS
 * @Date: 2020/10/10 13:28
 * @Description:
 */
public class JWTRealm extends AuthorizingRealm {


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)throws AuthenticationException{
        return new SimpleAuthenticationInfo(token.getPrincipal(), token.getPrincipal(), this.getName());

    }
}

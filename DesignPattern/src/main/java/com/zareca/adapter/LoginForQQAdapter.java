package com.zareca.adapter;

/**
 * @Auther: ly
 * @Date: 2020/10/18 23:00
 * @Description:
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}

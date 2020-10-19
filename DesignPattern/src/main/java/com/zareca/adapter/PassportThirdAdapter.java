package com.zareca.adapter;

/**
 * @Auther: ly
 * @Date: 2020/10/18 23:02
 * @Description:
 */
public class PassportThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        LoginAdapter loginAdapter = null;
        try {
            loginAdapter = clazz.newInstance();

            if (loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(key, loginAdapter);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

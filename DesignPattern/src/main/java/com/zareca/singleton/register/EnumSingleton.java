package com.zareca.singleton.register;

/**
 * @Auther: ly
 * @Date: 2020/10/13 10:20
 * @Description:
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}

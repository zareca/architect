package com.zareca.template;

import java.util.List;

/**
 * @Auther: ly
 * @Date: 2020/10/18 22:34
 * @Description:
 */
public class MemberDaoTest {

    public static void main(String[] args) throws Exception {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}

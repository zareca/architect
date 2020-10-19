package com.zareca.proxy.staticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/15 15:16
 * @Description:
 */
// 对CertServiceImpl进行增强
public class CertServiceImplProxy implements ICertService {

    private ICertService certService;

    public CertServiceImplProxy(ICertService certService) {
        this.certService = certService;
    }

    public void createCert(Cert cert) {
        before();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        Integer dbRouter = Integer.valueOf(yearFormat.format(cert.getDateTime()));
        DataSource.set(dbRouter);
        System.out.println("使用数据源" + DataSource.get() + "进行调用");
        certService.createCert(cert);
        after();
    }

    public void before() {
        System.out.println("对CertServiceImpl进行增强--前置增强");
    }

    public void after() {
        System.out.println("对CertServiceImpl进行增强--后置增强");
    }


    public Date getDateTime() {
        return new Date();
    }
}

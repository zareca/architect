package com.zareca.proxy.staticproxy;

import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/15 15:31
 * @Description:
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Cert cert = new Cert();
        cert.setCertId(1);
        cert.setName("证书名称");
        cert.setSn("2211331221");
        cert.setDateTime(new Date());
        ICertService certService = new CertServiceImplProxy(new CertServiceImpl(new CertDao()));
        certService.createCert(cert);
    }
}

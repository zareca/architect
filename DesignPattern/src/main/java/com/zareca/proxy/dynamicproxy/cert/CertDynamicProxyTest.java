package com.zareca.proxy.dynamicproxy.cert;

import com.zareca.proxy.staticproxy.Cert;
import com.zareca.proxy.staticproxy.CertDao;
import com.zareca.proxy.staticproxy.CertServiceImpl;
import com.zareca.proxy.staticproxy.ICertService;

import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/18 12:37
 * @Description:
 */
public class CertDynamicProxyTest {
    public static void main(String[] args) {
        Cert cert = new Cert();
        cert.setCertId(1);
        cert.setName("证书名称");
        cert.setSn("2211331221");
        cert.setDateTime(new Date());
        ICertService certService = (ICertService) new CertServiceDynamicProxy().getInstance(new CertServiceImpl(new CertDao()));
        certService.createCert(cert);
    }
}

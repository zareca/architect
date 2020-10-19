package com.zareca.proxy.staticproxy;

import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/15 14:51
 * @Description:
 */
public class CertServiceImpl implements ICertService {

    private CertDao certDao;

    public CertServiceImpl(CertDao certDao) {
        this.certDao = certDao;
    }

    public void createCert(Cert cert) {
        System.out.println("CertServiceImpl调用CertOrder");
        certDao.createCert(cert);
    }

    public Date getDateTime() {
        return new Date();
    }
}

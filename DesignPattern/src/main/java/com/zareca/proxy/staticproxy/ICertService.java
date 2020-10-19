package com.zareca.proxy.staticproxy;

import java.util.Date;

public interface ICertService {
    void createCert(Cert cert);

    Date getDateTime();
}
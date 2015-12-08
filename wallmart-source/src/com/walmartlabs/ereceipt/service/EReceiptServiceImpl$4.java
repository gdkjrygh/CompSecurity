// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptServiceImpl, WalletStatus

class t> extends GetServiceDataRunnable
{

    final EReceiptServiceImpl this$0;

    public WalletStatus onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        int i = servicedata.getHttpStatusCode();
        if (i == 200)
        {
            return new WalletStatus();
        } else
        {
            setErrorCode(i);
            return (WalletStatus)EReceiptServiceImpl.access$100(EReceiptServiceImpl.this).readValue(servicedata.getContent(), com/walmartlabs/ereceipt/service/WalletStatus);
        }
    }

    public volatile Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return onServiceDataReceived(servicedata);
    }

    (HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        this$0 = EReceiptServiceImpl.this;
        super(httprequestexecutor, httpurirequest, asynccallback);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.LoginResult;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetJsonRunnable;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, Util

private class <init> extends GetJsonRunnable
{

    final WalmartNetServiceImpl this$0;

    public LoginResult onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        servicedata = (LoginResult)super.onServiceDataReceived(servicedata);
        if (servicedata != null)
        {
            servicedata.setFirstName(WalmartNetServiceImpl.access$900(WalmartNetServiceImpl.this));
            servicedata.setLastName(WalmartNetServiceImpl.access$1000(WalmartNetServiceImpl.this));
            servicedata.setCustomerId(Util.getCustomerId(getCookies()));
            servicedata.setCid(Util.getCID(getCookies()));
        }
        return servicedata;
    }

    public volatile Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return onServiceDataReceived(servicedata);
    }

    private (HttpUriRequest httpurirequest, Class class1, AsyncCallback asynccallback)
    {
        this$0 = WalmartNetServiceImpl.this;
        super(WalmartNetServiceImpl.access$700(WalmartNetServiceImpl.this), httpurirequest, asynccallback, class1, WalmartNetServiceImpl.access$600(WalmartNetServiceImpl.this));
        setServiceDataValidator(WalmartNetServiceImpl.access$800(WalmartNetServiceImpl.this));
    }

    setServiceDataValidator(HttpUriRequest httpurirequest, Class class1, AsyncCallback asynccallback, setServiceDataValidator setservicedatavalidator)
    {
        this(httpurirequest, class1, asynccallback);
    }
}

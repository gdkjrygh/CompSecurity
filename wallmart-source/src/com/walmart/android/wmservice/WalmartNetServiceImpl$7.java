// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.LocalAd;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, WalmartServiceException

class it> extends GetServiceDataRunnable
{

    final WalmartNetServiceImpl this$0;

    public LocalAd onServiceDataReceived(ServiceData servicedata)
        throws WalmartServiceException, IOException
    {
        servicedata = (LocalAd)WalmartNetServiceImpl.access$600(WalmartNetServiceImpl.this).readValue(servicedata.getContent(), com/walmart/android/data/LocalAd);
        if (servicedata != null)
        {
            WalmartNetServiceImpl.access$1100(WalmartNetServiceImpl.this, servicedata);
        }
        return servicedata;
    }

    public volatile Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return onServiceDataReceived(servicedata);
    }

    (HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        this$0 = WalmartNetServiceImpl.this;
        super(httprequestexecutor, httpurirequest, asynccallback);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.data.LoginResult;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, WalmartServiceException

class it> extends GetServiceDataRunnable
{

    final WalmartNetServiceImpl this$0;

    public Boolean onServiceDataReceived(ServiceData servicedata)
        throws WalmartServiceException, IOException
    {
        boolean flag;
        if (!((LoginResult)WalmartNetServiceImpl.access$600(WalmartNetServiceImpl.this).readValue(servicedata.getContent(), com/walmart/android/data/LoginResult)).isLoggedIn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        servicedata;
        servicedata.printStackTrace();
_L2:
        return Boolean.valueOf(false);
        servicedata;
        servicedata.printStackTrace();
        continue; /* Loop/switch isn't completed */
        servicedata;
        throw servicedata;
        servicedata;
        servicedata.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
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

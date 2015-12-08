// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverServiceImpl, RecommendationResponse

class nit> extends GetServiceDataRunnable
{

    final SaverServiceImpl this$0;

    public RecommendationResponse onServiceDataReceived(ServiceData servicedata)
        throws IOException
    {
        servicedata = (RecommendationResponse)SaverServiceImpl.access$000(SaverServiceImpl.this).readValue(servicedata.getContent(), com/walmart/android/service/saver/RecommendationResponse);
        if (servicedata != null && !"OK".equals(((RecommendationResponse) (servicedata)).status))
        {
            setErrorCode(0x15f91);
        }
        return servicedata;
    }

    public volatile Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return onServiceDataReceived(servicedata);
    }

    nse(HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback)
    {
        this$0 = SaverServiceImpl.this;
        super(httprequestexecutor, httpurirequest, asynccallback);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverServiceImpl, StatusResponse

class nit> extends GetServiceDataRunnable
{

    final SaverServiceImpl this$0;
    final HttpUriRequest val$request;
    final Class val$responseType;

    public StatusResponse onServiceDataReceived(ServiceData servicedata)
        throws IOException
    {
        StatusResponse statusresponse = (StatusResponse)SaverServiceImpl.access$000(SaverServiceImpl.this).readValue(servicedata.getContent(), val$responseType);
        if (statusresponse != null && !TextUtils.isEmpty(statusresponse.error) && statusresponse.statusCode > 0)
        {
            setErrorCode(statusresponse.statusCode);
        }
        if (statusresponse != null && statusresponse.statusCode == 401 || servicedata.getHttpStatusCode() == 401)
        {
            servicedata = Services.get().getAuthentication();
            String s = (new StringBuilder()).append("We are unauthorized when calling ").append(val$request.getURI()).toString();
            s = (new StringBuilder()).append(s).append(", ").append((System.currentTimeMillis() - servicedata.getLastSessionRenewal()) / 1000L).append("s since last session renewal").toString();
            WLog.e(SaverServiceImpl.access$100(), s, new Exception());
            servicedata.clearLastLoginTime();
        }
        return statusresponse;
    }

    public volatile Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return onServiceDataReceived(servicedata);
    }

    (AsyncCallback asynccallback, Class class1, HttpUriRequest httpurirequest1)
    {
        this$0 = final_saverserviceimpl;
        val$responseType = class1;
        val$request = httpurirequest1;
        super(final_httprequestexecutor, HttpUriRequest.this, asynccallback);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.walmart.android.service:
//            GetServiceDataRunnable, ServiceException, ServiceData, JsonMapper, 
//            HttpRequestExecutor, AsyncCallback

public class GetJsonRunnable extends GetServiceDataRunnable
{

    private final Class mClazz;
    private final JsonMapper mJsonMapper;

    public GetJsonRunnable(HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback, Class class1, JsonMapper jsonmapper)
    {
        super(httprequestexecutor, httpurirequest, asynccallback);
        mClazz = class1;
        mJsonMapper = jsonmapper;
    }

    protected JsonMapper getJsonMapper()
    {
        return mJsonMapper;
    }

    protected Class getResultClass()
    {
        return mClazz;
    }

    public Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return mJsonMapper.readValue(servicedata.getContent(), mClazz);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.GetServiceDataRunnable;
import com.walmart.android.service.HttpRequestExecutor;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceException;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmartlabs.android.pharmacy.service:
//            PharmacyServiceImpl

public static class mJsonMapper extends GetServiceDataRunnable
{

    private final JsonMapper mJsonMapper;
    private final TypeReference mTypeReference;

    public Object onServiceDataReceived(ServiceData servicedata)
        throws ServiceException, IOException
    {
        return mJsonMapper.readValue(servicedata.getContent(), mTypeReference);
    }

    public (HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, AsyncCallback asynccallback, TypeReference typereference, JsonMapper jsonmapper)
    {
        super(httprequestexecutor, httpurirequest, asynccallback);
        mTypeReference = typereference;
        mJsonMapper = jsonmapper;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;

import java.util.List;

// Referenced classes of package com.ubercab.crash.model:
//            Shape_NetworkLog

public abstract class NetworkLog
{

    public NetworkLog()
    {
    }

    public static NetworkLog create(String s, String s1, String s2, String s3, String s4, int i, long l, 
            List list, List list1, String s5, String s6)
    {
        return (new Shape_NetworkLog()).setProtocol(s).setRequestType(s1).setHostUrl(s2).setEndpointPath(s3).setQueryParams(s4).setStatusCode(i).setRequestTime(l).setRequestHeaders(list).setResponseHeaders(list1).setRequestBody(s5).setResponseBody(s6);
    }

    public abstract String getEndpointPath();

    public abstract String getHostUrl();

    public abstract String getProtocol();

    public abstract String getQueryParams();

    public abstract String getRequestBody();

    public abstract List getRequestHeaders();

    public abstract long getRequestTime();

    public abstract String getRequestType();

    public abstract String getResponseBody();

    public abstract List getResponseHeaders();

    public abstract int getStatusCode();

    abstract NetworkLog setEndpointPath(String s);

    abstract NetworkLog setHostUrl(String s);

    abstract NetworkLog setProtocol(String s);

    abstract NetworkLog setQueryParams(String s);

    abstract NetworkLog setRequestBody(String s);

    abstract NetworkLog setRequestHeaders(List list);

    abstract NetworkLog setRequestTime(long l);

    abstract NetworkLog setRequestType(String s);

    abstract NetworkLog setResponseBody(String s);

    abstract NetworkLog setResponseHeaders(List list);

    abstract NetworkLog setStatusCode(int i);
}

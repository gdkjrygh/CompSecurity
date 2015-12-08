// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            NetworkResponse

public class VolleyError extends Exception
{

    public final NetworkResponse networkResponse;
    private long networkTimeMs;

    public VolleyError()
    {
        networkResponse = null;
    }

    public VolleyError(NetworkResponse networkresponse)
    {
        networkResponse = networkresponse;
    }

    public VolleyError(String s)
    {
        super(s);
        networkResponse = null;
    }

    public VolleyError(String s, Throwable throwable)
    {
        super(s, throwable);
        networkResponse = null;
    }

    public VolleyError(Throwable throwable)
    {
        super(throwable);
        networkResponse = null;
    }

    public long getNetworkTimeMs()
    {
        return networkTimeMs;
    }

    void setNetworkTimeMs(long l)
    {
        networkTimeMs = l;
    }
}

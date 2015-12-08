// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import com.squareup.okhttp.OkHttpClient;
import java.util.HashMap;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Service, Log, Converter

public static class 
{

    private Converter mConverter;
    private String mHost;
    private Log mLog;
    private OkHttpClient mOkHttpClient;
    private String mPath;
    private final HashMap mQueryParameters = new HashMap();
    private boolean mSecure;

    private OkHttpClient createDefaultOkHttpClient()
    {
        return new OkHttpClient();
    }

    public Service build()
    {
        if (mOkHttpClient == null)
        {
            mOkHttpClient = createDefaultOkHttpClient();
        }
        if (mLog == null)
        {
            logLevel(logLevel);
        }
        return new Service(this, null);
    }

    public logLevel converter(Converter converter1)
    {
        mConverter = converter1;
        return this;
    }

    public mConverter host(String s)
    {
        mHost = s;
        return this;
    }

    public mHost log(Log log1)
    {
        mLog = log1;
        return this;
    }

    public mLog logLevel(mLog mlog)
    {
        mLog = Log.createDefault(mlog);
        return this;
    }

    public t okHttpClient(OkHttpClient okhttpclient)
    {
        mOkHttpClient = okhttpclient;
        return this;
    }

    public mOkHttpClient path(String s)
    {
        mPath = s;
        return this;
    }

    public mPath query(String s, String s1)
    {
        mQueryParameters.put(s, s1);
        return this;
    }

    public mQueryParameters secure(boolean flag)
    {
        mSecure = flag;
        return this;
    }








    public ()
    {
    }
}

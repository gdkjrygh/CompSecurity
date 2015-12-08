// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.jiubang.commerce.utils:
//            c

public class h
{

    public static HttpResponse a(String s)
    {
        return a(s, 30000, 30000);
    }

    public static HttpResponse a(String s, int i, int j)
    {
        s = new HttpGet(s);
        BasicHttpParams basichttpparams;
        Object obj;
        Exception exception;
        try
        {
            basichttpparams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 30000);
            HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
            obj = new DefaultHttpClient(basichttpparams);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = ((HttpClient) (obj)).execute(s);
        return ((HttpResponse) (obj));
        exception;
        s = c.a(basichttpparams).execute(s);
        return s;
    }
}

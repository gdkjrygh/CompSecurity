// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Handler;
import android.os.Message;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ai, s, as, c, 
//            aj

public class ad extends ai
{

    private static final String a = com/paypal/android/sdk/onetouch/core/ad.getSimpleName();
    private Handler b;
    private String c;
    private String d;
    private String e;
    private s f;

    public ad(String s1, String s2, String s3, s s4, Handler handler)
    {
        b = handler;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
    }

    public void run()
    {
        Object obj;
        Object obj1;
        if (b == null)
        {
            return;
        }
        obj1 = null;
        DefaultHttpClient defaulthttpclient;
        String s1;
        Exception exception;
        try
        {
            b.sendMessage(Message.obtain(b, 20, c));
            defaulthttpclient = new DefaultHttpClient();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            defaulthttpclient = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            defaulthttpclient = null;
        }
        HttpConnectionParams.setSoTimeout(defaulthttpclient.getParams(), 10000);
        HttpConnectionParams.setConnectionTimeout(defaulthttpclient.getParams(), 10000);
        obj = new HttpGet(c);
        ((HttpGet) (obj)).setHeader("User-Agent", String.format("%s/%s/%s/%s/Android", new Object[] {
            f.a(), f.b(), e, d
        }));
        ((HttpGet) (obj)).setHeader("Accept-Language", "en-us");
        as.a(a, String.format("%s/%s/%s/%s/Android", new Object[] {
            f.a(), f.b(), e, d
        }));
        obj = new BufferedReader(new InputStreamReader(defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj))).getEntity().getContent(), "UTF-8"));
        obj1 = new StringBuilder();
_L3:
        s1 = ((BufferedReader) (obj)).readLine();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj1)).append(s1);
          goto _L3
        obj1;
_L7:
        b.sendMessage(Message.obtain(b, 21, obj1));
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj)));
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        aj.a().b(this);
        return;
_L2:
        b.sendMessage(Message.obtain(b, 22, ((StringBuilder) (obj1)).toString()));
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj)));
        defaulthttpclient.getConnectionManager().shutdown();
        aj.a().b(this);
        return;
_L5:
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj1)));
        if (defaulthttpclient != null)
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        aj.a().b(this);
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_39;
        obj1;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

}

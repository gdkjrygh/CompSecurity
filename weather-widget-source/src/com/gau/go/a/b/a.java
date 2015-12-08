// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.b;

import android.content.Context;
import android.net.Proxy;
import com.gau.go.a.a.c;
import com.gau.go.a.e;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class a
{

    protected HttpURLConnection a;
    protected Context b;

    public a(Context context)
    {
        b = context;
    }

    public int a(int i, String s)
    {
        if (!e.a(b).b()) goto _L2; else goto _L1
_L1:
        URL url = new URL("http://61.145.124.212:8083/GOClientData/DR?ptl=10&is_zip=1");
_L7:
        if (i != 1030)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        url = new URL(s);
        if (!com.gau.go.a.f.e.a(b))
        {
            break MISSING_BLOCK_LABEL_264;
        }
        i = com.gau.go.a.f.e.b(b);
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (com.gau.go.a.f.e.b(b) != 2) goto _L4; else goto _L3
_L3:
        s = Proxy.getDefaultHost();
        i = Proxy.getDefaultPort();
        s = new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, i));
_L8:
        if (s == null) goto _L6; else goto _L5
_L5:
        s = (HttpURLConnection)url.openConnection(s);
_L9:
        s.setDoOutput(true);
        s.setDoInput(true);
        s.setRequestMethod("POST");
        s.setUseCaches(false);
        s.setInstanceFollowRedirects(true);
        s.setConnectTimeout(30000);
        s.setReadTimeout(30000);
        s.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        a = s;
        return 0;
_L2:
label0:
        {
            if (i != 19)
            {
                break label0;
            }
            try
            {
                url = new URL("http://goupdate.3g.cn/GOClientData/DR?ptl=10&is_zip=1&is_response_json=1");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 2;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return 1;
            }
        }
          goto _L7
        url = new URL("http://goupdate.3g.cn/GOClientData/DR?ptl=10&is_zip=1");
          goto _L7
_L4:
        s = com.gau.go.a.f.e.c(b);
        i = com.gau.go.a.f.e.d(b);
        s = new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, i));
          goto _L8
        s;
        s = null;
          goto _L8
_L6:
        s = (HttpURLConnection)url.openConnection();
          goto _L9
        s = null;
          goto _L8
    }

    public void a(c c1)
    {
        if (2 == a(c1.a, c1.h))
        {
            c1.f = 2;
            return;
        } else
        {
            c(c1);
            return;
        }
    }

    public StringBuilder b(c c1)
    {
        StringBuilder stringbuilder = new StringBuilder(c1.h);
        for (c1 = c1.o; c1 != null && c1.h != null; c1 = c1.o)
        {
            stringbuilder.append("\r\n");
            stringbuilder.append(c1.h);
        }

        return stringbuilder;
    }

    public abstract void c(c c1);
}

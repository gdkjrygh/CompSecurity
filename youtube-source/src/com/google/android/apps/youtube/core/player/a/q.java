// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import android.net.Uri;
import android.util.Base64;
import java.util.Arrays;
import java.util.List;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;

public final class q
    implements HttpRequestInterceptor
{

    static final List a = Arrays.asList(new String[] {
        "dnc", "cpn", "proxy-auth"
    });
    private final Mac b = Mac.getInstance("HmacSHA1");

    public q()
    {
        javax.crypto.SecretKey secretkey = KeyGenerator.getInstance("HmacSHA1").generateKey();
        b.init(secretkey);
    }

    private String b(Uri uri)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j;
        b.update(uri.getEncodedPath().getBytes());
        uri = uri.getEncodedQuery().split("&");
        j = uri.length;
_L2:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s = uri[i];
        if (!a.contains(s.split("=")[0]))
        {
            b.update(s.getBytes());
        }
        break MISSING_BLOCK_LABEL_96;
        uri = Base64.encodeToString(b.doFinal(), 0);
        this;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Uri a(Uri uri)
    {
        return uri.buildUpon().appendQueryParameter("proxy-auth", b(uri)).build();
    }

    public final void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        httprequest = Uri.parse(httprequest.getRequestLine().getUri());
        httpcontext = httprequest.getQueryParameter("proxy-auth");
        boolean flag;
        if (httpcontext != null)
        {
            flag = b(httprequest).equals(httpcontext);
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new ProtocolException("The URL is not signed correctly");
        } else
        {
            return;
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.i;
import com.google.android.apps.youtube.common.cache.j;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.an;
import com.google.android.apps.youtube.core.async.u;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ay;
import com.google.android.apps.youtube.core.converter.http.dp;
import com.google.android.apps.youtube.core.converter.n;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

public abstract class m
{

    protected final Executor b;
    protected final HttpClient c;
    protected final b d;
    protected final String e;
    protected final dp f;
    protected final n g;

    public m(Executor executor, HttpClient httpclient)
    {
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor can't be null");
        c = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient, "httpClient can't be null");
        f = new dp(HttpMethod.GET);
        g = null;
        e = null;
        d = null;
    }

    public m(Executor executor, HttpClient httpclient, b b1)
    {
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor can't be null");
        c = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient, "httpClient can't be null");
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1, "clock can't be null");
        f = new dp(HttpMethod.GET);
        g = null;
        e = null;
    }

    public m(Executor executor, HttpClient httpclient, n n1, b b1)
    {
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor can't be null");
        c = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient, "httpClient can't be null");
        g = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1, "xmlParser cannot be null");
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1, "clock cannot be null");
        f = new dp(HttpMethod.GET);
        e = null;
    }

    public m(Executor executor, HttpClient httpclient, n n1, String s, b b1)
    {
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor can't be null");
        c = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient, "httpClient can't be null");
        g = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1, "xmlParser can't be null");
        e = (String)com.google.android.apps.youtube.common.fromguava.c.a(s, "cachePath can't be null");
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1, "clock can't be null");
        f = new dp(HttpMethod.GET);
    }

    public m(Executor executor, HttpClient httpclient, String s, b b1)
    {
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor can't be null");
        c = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient, "httpClient can't be null");
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1, "clock can't be null");
        e = s;
        f = new dp(HttpMethod.GET);
        g = null;
    }

    protected static com.google.android.apps.youtube.common.cache.b a(int k)
    {
        return new com.google.android.apps.youtube.common.cache.b(k);
    }

    protected static com.google.android.apps.youtube.core.async.m a(d d1, a a1, af af)
    {
        return new com.google.android.apps.youtube.core.async.m(d1, a1, af);
    }

    protected static j b(int k)
    {
        return new j(k);
    }

    protected final an a(a a1, af af, long l)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d, "this instance does not contain a clock");
        return an.a(a1, af, d, l);
    }

    protected final com.google.android.apps.youtube.core.async.b a(af af)
    {
        return com.google.android.apps.youtube.core.async.b.a(b, af);
    }

    protected final u a(com.google.android.apps.youtube.core.converter.c c1, ay ay)
    {
        return new u(c, c1, ay);
    }

    protected final void d()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e, "this instance does not support persistent caching");
        com.google.android.apps.youtube.common.cache.c.a(b, e, 0x1400000L);
    }

    protected final com.google.android.apps.youtube.common.cache.c e()
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e, "this instance does not support persistent caching");
        return (new i(e)).a(b);
    }
}

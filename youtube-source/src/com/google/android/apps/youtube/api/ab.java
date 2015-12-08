// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.net.Uri;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.ba;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ao;
import com.google.android.apps.youtube.core.converter.http.bl;
import com.google.android.apps.youtube.core.converter.http.dx;
import com.google.android.apps.youtube.core.converter.http.f;
import com.google.android.apps.youtube.core.converter.http.fn;
import com.google.android.apps.youtube.core.converter.http.fo;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.core.identity.ar;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

public final class ab extends ba
    implements bc
{

    private final GDataRequestFactory a;
    private final ao h;
    private fo i;
    private dx j;
    private a k;
    private a l;
    private final af m;
    private final af n;
    private final af o;
    private final af p;
    private final af q;

    public ab(Executor executor, HttpClient httpclient, b b1, n n1, GDataRequestFactory gdatarequestfactory, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, 
            com.google.android.apps.youtube.core.async.GDataRequest.Version version, ar ar)
    {
        super(executor, httpclient, n1, b1);
        a = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        com.google.android.apps.youtube.common.fromguava.c.a(version);
        h = new ao(HttpMethod.GET, deviceauthorizerforv2apis, list, version, ar);
        i = new fo(g);
        k = a(500);
        executor = a(a(h, i));
        m = a(k, executor, 0xdbba00L);
        executor = new fn(g);
        o = a(a(h, executor));
        j = new dx(g);
        l = a(100);
        executor = a(a(h, j));
        n = a(l, executor, 0x1b7740L);
        executor = new f(g);
        p = a(a(20), a(a(h, executor)), 0x6ddd00L);
        executor = new bl(g);
        q = a(a(h, executor));
    }

    public final GDataRequestFactory a()
    {
        return a;
    }

    public final void a(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        af af1 = n;
        GDataRequestFactory gdatarequestfactory = a;
        af1.a(GDataRequestFactory.a(uri), b1);
    }

    public final void a(String s, com.google.android.apps.youtube.common.a.b b1)
    {
        m.a(a.a(s), b1);
    }

    public final af b()
    {
        return m;
    }

    public final void b(String s, com.google.android.apps.youtube.common.a.b b1)
    {
        p.a(a.j(s), b1);
    }

    public final af c()
    {
        return o;
    }
}

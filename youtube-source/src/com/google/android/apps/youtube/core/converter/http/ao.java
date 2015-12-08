// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.w;
import com.google.android.apps.youtube.core.identity.ar;
import com.google.android.apps.youtube.core.utils.ai;
import java.util.List;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bw, HttpMethod

public final class ao extends bw
{

    public final ai a;
    public final com.google.android.apps.youtube.core.async.GDataRequest.Version b;
    private final ar g;

    public ao(HttpMethod httpmethod, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, com.google.android.apps.youtube.core.async.GDataRequest.Version version, ar ar1)
    {
        super(httpmethod, deviceauthorizerforv2apis, list);
        a = null;
        b = (com.google.android.apps.youtube.core.async.GDataRequest.Version)c.a(version);
        g = (ar)c.a(ar1);
    }

    private ao(HttpMethod httpmethod, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, ai ai1, com.google.android.apps.youtube.core.async.GDataRequest.Version version)
    {
        super(httpmethod, deviceauthorizerforv2apis, list);
        a = (ai)c.a(ai1);
        b = (com.google.android.apps.youtube.core.async.GDataRequest.Version)c.a(version);
        g = null;
    }

    public ao(HttpMethod httpmethod, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, ai ai1, com.google.android.apps.youtube.core.async.GDataRequest.Version version, ar ar1)
    {
        super(httpmethod, deviceauthorizerforv2apis, list);
        a = (ai)c.a(ai1);
        b = (com.google.android.apps.youtube.core.async.GDataRequest.Version)c.a(version);
        g = (ar)c.a(ar1);
    }

    public ao(HttpMethod httpmethod, String s, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, ai ai1, com.google.android.apps.youtube.core.async.GDataRequest.Version version, ar ar1)
    {
        super(httpmethod, s, deviceauthorizerforv2apis, list);
        a = (ai)c.a(ai1);
        b = (com.google.android.apps.youtube.core.async.GDataRequest.Version)c.a(version);
        g = (ar)c.a(ar1);
    }

    public static ao a(HttpMethod httpmethod, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, ai ai1, com.google.android.apps.youtube.core.async.GDataRequest.Version version)
    {
        return new ao(httpmethod, deviceauthorizerforv2apis, list, ai1, version);
    }

    private HttpUriRequest a(GDataRequest gdatarequest)
    {
        gdatarequest = super.b(gdatarequest);
        gdatarequest.setHeader("GData-Version", b.headerValue);
        return gdatarequest;
    }

    public final volatile Object a(Object obj)
    {
        return a((GDataRequest)obj);
    }

    protected final HttpUriRequest a(w w)
    {
        w = (GDataRequest)w;
        Object obj;
        if (a == null)
        {
            w = ((GDataRequest) (w)).a;
        } else
        {
            w = a.a(((GDataRequest) (w)).a);
        }
        obj = w;
        if (g != null)
        {
            obj = g.a(w);
        }
        return e.createHttpRequest(((android.net.Uri) (obj)));
    }

    public final HttpUriRequest b(w w)
    {
        return a((GDataRequest)w);
    }
}

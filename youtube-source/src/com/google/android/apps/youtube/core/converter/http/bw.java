// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.w;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.c;
import com.google.android.apps.youtube.datalib.a.p;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            HttpMethod

public class bw
    implements c
{

    public final DeviceAuthorizerForV2Apis c;
    public final List d;
    public final HttpMethod e;
    public final String f;

    public bw(HttpMethod httpmethod, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list)
    {
        c = (DeviceAuthorizerForV2Apis)com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (HttpMethod)com.google.android.apps.youtube.common.fromguava.c.a(httpmethod);
        f = null;
    }

    public bw(HttpMethod httpmethod, String s, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list)
    {
        c = (DeviceAuthorizerForV2Apis)com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (HttpMethod)com.google.android.apps.youtube.common.fromguava.c.a(httpmethod);
        f = com.google.android.apps.youtube.common.fromguava.c.a(s, "contentType can't be null or empty");
    }

    public bw(HttpMethod httpmethod, List list)
    {
        c = null;
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (HttpMethod)com.google.android.apps.youtube.common.fromguava.c.a(httpmethod);
        f = null;
    }

    public Object a(Object obj)
    {
        return b((w)obj);
    }

    protected HttpUriRequest a(w w1)
    {
        return e.createHttpRequest(w1.a);
    }

    public HttpUriRequest b(w w1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(w1);
        if (w1.c != null && !e.supportsPayload())
        {
            throw new IllegalArgumentException((new StringBuilder("Content not allowed [method=")).append(e).append("]").toString());
        }
        HttpUriRequest httpurirequest = a(w1);
        httpurirequest.setHeader("Accept-Encoding", "gzip");
        java.util.Map.Entry entry;
        for (Iterator iterator = w1.b.entrySet().iterator(); iterator.hasNext(); httpurirequest.setHeader((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        Iterator iterator1;
        if (c != null)
        {
            try
            {
                Uri uri = Uri.parse(httpurirequest.getURI().toString());
                httpurirequest.setHeader("X-GData-Device", c.a(uri));
            }
            // Misplaced declaration of an exception variable
            catch (w w1)
            {
                throw new ConverterException(w1);
            }
        }
        for (iterator1 = d.iterator(); iterator1.hasNext(); ((p)iterator1.next()).a(httpurirequest)) { }
        if (w1.c != null)
        {
            w1 = new ByteArrayEntity(w1.c);
            w1.setContentType(f);
            ((HttpEntityEnclosingRequestBase)httpurirequest).setEntity(w1);
        }
        return httpurirequest;
    }
}

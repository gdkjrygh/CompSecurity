// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//            zzy, zza, zzk

public class zzw
    implements zzy
{
    public static final class zza extends HttpEntityEnclosingRequestBase
    {

        public String getMethod()
        {
            return "PATCH";
        }

        public zza()
        {
        }

        public zza(String s)
        {
            setURI(URI.create(s));
        }
    }


    protected final HttpClient zzaD;

    public zzw(HttpClient httpclient)
    {
        zzaD = httpclient;
    }

    private static void zza(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, zzk zzk1)
        throws com.google.android.gms.internal.zza
    {
        zzk1 = zzk1.zzq();
        if (zzk1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(zzk1));
        }
    }

    private static void zza(HttpUriRequest httpurirequest, Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); httpurirequest.setHeader(s, (String)map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    static HttpUriRequest zzb(zzk zzk1, Map map)
        throws com.google.android.gms.internal.zza
    {
        switch (zzk1.getMethod())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = zzk1.zzm();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(zzk1.getUrl());
                httppost.addHeader("Content-Type", zzk1.zzl());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(zzk1.getUrl());
            }

        case 0: // '\0'
            return new HttpGet(zzk1.getUrl());

        case 3: // '\003'
            return new HttpDelete(zzk1.getUrl());

        case 1: // '\001'
            map = new HttpPost(zzk1.getUrl());
            map.addHeader("Content-Type", zzk1.zzp());
            zza(map, zzk1);
            return map;

        case 2: // '\002'
            map = new HttpPut(zzk1.getUrl());
            map.addHeader("Content-Type", zzk1.zzp());
            zza(map, zzk1);
            return map;

        case 4: // '\004'
            return new HttpHead(zzk1.getUrl());

        case 5: // '\005'
            return new HttpOptions(zzk1.getUrl());

        case 6: // '\006'
            return new HttpTrace(zzk1.getUrl());

        case 7: // '\007'
            map = new zza(zzk1.getUrl());
            map.addHeader("Content-Type", zzk1.zzp());
            zza(map, zzk1);
            return map;
        }
    }

    public HttpResponse zza(zzk zzk1, Map map)
        throws IOException, com.google.android.gms.internal.zza
    {
        HttpUriRequest httpurirequest = zzb(zzk1, map);
        zza(httpurirequest, map);
        zza(httpurirequest, zzk1.getHeaders());
        zza(httpurirequest);
        map = httpurirequest.getParams();
        int i = zzk1.zzt();
        HttpConnectionParams.setConnectionTimeout(map, 5000);
        HttpConnectionParams.setSoTimeout(map, i);
        return zzaD.execute(httpurirequest);
    }

    protected void zza(HttpUriRequest httpurirequest)
        throws IOException
    {
    }
}

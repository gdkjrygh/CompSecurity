// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.p;
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

// Referenced classes of package com.android.a.a:
//            j, h

public class g
    implements j
{

    protected final HttpClient a;

    public g(HttpClient httpclient)
    {
        a = httpclient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, p p1)
    {
        p1 = p1.q();
        if (p1 != null)
        {
            httpentityenclosingrequestbase.setEntity(new ByteArrayEntity(p1));
        }
    }

    private static void a(HttpUriRequest httpurirequest, Map map)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            String s = (String)iterator.next();
            httpurirequest.setHeader(s, (String)map.get(s));
        } while (true);
    }

    static HttpUriRequest b(p p1, Map map)
    {
        switch (p1.a())
        {
        default:
            throw new IllegalStateException("Unknown request method.");

        case -1: 
            map = p1.m();
            if (map != null)
            {
                HttpPost httppost = new HttpPost(p1.d());
                httppost.addHeader("Content-Type", p1.l());
                httppost.setEntity(new ByteArrayEntity(map));
                return httppost;
            } else
            {
                return new HttpGet(p1.d());
            }

        case 0: // '\0'
            return new HttpGet(p1.d());

        case 3: // '\003'
            return new HttpDelete(p1.d());

        case 1: // '\001'
            map = new HttpPost(p1.d());
            map.addHeader("Content-Type", p1.p());
            a(map, p1);
            return map;

        case 2: // '\002'
            map = new HttpPut(p1.d());
            map.addHeader("Content-Type", p1.p());
            a(map, p1);
            return map;

        case 4: // '\004'
            return new HttpHead(p1.d());

        case 5: // '\005'
            return new HttpOptions(p1.d());

        case 6: // '\006'
            return new HttpTrace(p1.d());

        case 7: // '\007'
            map = new h(p1.d());
            map.addHeader("Content-Type", p1.p());
            a(map, p1);
            return map;
        }
    }

    public HttpResponse a(p p1, Map map)
    {
        HttpUriRequest httpurirequest = b(p1, map);
        a(httpurirequest, map);
        a(httpurirequest, p1.i());
        a(httpurirequest, p1);
        map = httpurirequest.getParams();
        int i = p1.t();
        HttpConnectionParams.setConnectionTimeout(map, 15000);
        HttpConnectionParams.setSoTimeout(map, i);
        return a.execute(httpurirequest);
    }

    protected void a(HttpUriRequest httpurirequest, p p1)
    {
    }
}

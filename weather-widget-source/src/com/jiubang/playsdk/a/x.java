// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import com.android.a.a.g;
import com.android.a.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.jiubang.playsdk.a:
//            o

public class x extends g
{

    public x(HttpClient httpclient)
    {
        super(httpclient);
    }

    private static List a(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair(s, (String)map.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    protected void a(HttpUriRequest httpurirequest, p p)
    {
        if ((httpurirequest instanceof HttpEntityEnclosingRequest) && (p instanceof o))
        {
            HttpEntityEnclosingRequest httpentityenclosingrequest = (HttpEntityEnclosingRequest)httpurirequest;
            httpentityenclosingrequest.removeHeaders("Content-Type");
            UrlEncodedFormEntity urlencodedformentity = new UrlEncodedFormEntity(a(((o)p).j()), "UTF-8");
            urlencodedformentity.setChunked(false);
            httpentityenclosingrequest.setEntity(urlencodedformentity);
        }
        super.a(httpurirequest, p);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.client.cf;
import com.google.android.apps.youtube.core.client.h;
import com.google.android.apps.youtube.core.converter.c;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.a.p;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            c

public final class b
    implements c
{

    private static final Uri a = Uri.parse("https://www.youtube.com/get_ad_tags");
    private final List b;
    private final h c;

    public b(h h1, List list)
    {
        c = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        b = com.google.android.apps.youtube.common.e.c.a(list);
    }

    public static Map a(long l, String s, al al1, int i, int j, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("last_ad", String.valueOf(l));
        hashmap.put("cpn", com.google.android.apps.youtube.common.fromguava.c.a(s, "cpn cannot be null or empty"));
        if (al1 != null)
        {
            hashmap.put("vis", al1.b());
        }
        hashmap.put("conn", String.valueOf(i));
        hashmap.put("apsad", String.valueOf(j));
        if (flag)
        {
            hashmap.put("splay", "1");
        }
        return hashmap;
    }

    public static Map a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        String s;
        if (flag)
        {
            s = "2";
        } else
        {
            s = "1";
        }
        hashmap.put("pin", s);
        return hashmap;
    }

    private HttpUriRequest a(com.google.android.apps.youtube.core.converter.http.c c1)
    {
        Object obj = a.buildUpon().appendQueryParameter("action_vmap", "1").appendQueryParameter("version", "2").appendQueryParameter("v", c1.a).appendQueryParameter("platform", "android").appendQueryParameter("afv_instream", "1");
        Object obj1 = c.k();
        if (obj1 != null)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("lact", String.valueOf(((cf) (obj1)).b()));
        }
        if (!TextUtils.isEmpty(c.j()))
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("clientid", c.j());
        }
        if (!TextUtils.isEmpty(c.c()))
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("iso_country", c.c());
        }
        for (c1 = c1.b.entrySet().iterator(); c1.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)((java.util.Map.Entry) (obj1)).getKey(), (String)((java.util.Map.Entry) (obj1)).getValue()))
        {
            obj1 = (java.util.Map.Entry)c1.next();
        }

        if (c.f())
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("more_ads", "1");
        }
        obj1 = c.a();
        c1 = new HttpPost(((a) (obj1)).b(((android.net.Uri.Builder) (obj)).build()).toString());
        obj = new ArrayList();
        java.util.Map.Entry entry;
        for (obj1 = ((a) (obj1)).a().entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        }

        if (c.b() != null)
        {
            ((List) (obj)).add(new BasicNameValuePair("channel_id", c.b()));
        }
        if (!TextUtils.isEmpty(c.d()))
        {
            ((List) (obj)).add(new BasicNameValuePair("Doritos", c.d()));
        }
        try
        {
            c1.setEntity(new UrlEncodedFormEntity(((List) (obj))));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            L.b("UnsupportedEncodingException encountered when generating adTagRequest");
        }
        if (c.e() != null)
        {
            c1.setHeader("embedded_app_package", c.e());
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((p)iterator.next()).a(c1)) { }
        return c1;
    }

    public final volatile Object a(Object obj)
    {
        return a((com.google.android.apps.youtube.core.converter.http.c)obj);
    }

}

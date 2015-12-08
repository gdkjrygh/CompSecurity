// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller;

import android.net.Uri;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.toolbox.p;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.datalib.a.e;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.c.f;
import com.google.android.apps.youtube.datalib.config.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller:
//            i

public final class h extends p
{

    private final i a;
    private final ak b;
    private final f c;
    private final List d;
    private final a e;
    private final String f;

    public h(int j, i k, l l, ak ak1, f f1, List list, a a1, 
            String s)
    {
        super(j, "", k.e(), l, l);
        a = k;
        b = (ak)com.google.android.apps.youtube.common.fromguava.c.a(ak1);
        c = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        f = s;
    }

    private void a(JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append("curl ");
            Map map = h();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("-H \"")).append(s).append(":").append((String)map.get(s)).append("\" ").toString()))
            {
                s = (String)iterator.next();
            }

        }
        catch (AuthFailureError authfailureerror)
        {
            L.c("Curl command line not available", authfailureerror);
        }
        stringbuilder.append("-H \"Content-Type:application/json\" ");
        stringbuilder.append("-d \"");
        stringbuilder.append(jsonobject);
        stringbuilder.append("\" ");
        stringbuilder.append(c());
        L.d("Curl commandline");
        L.d(stringbuilder.toString());
    }

    protected final VolleyError a(VolleyError volleyerror)
    {
        if (e.a())
        {
            a(a.e());
        }
        return super.a(volleyerror);
    }

    protected final m a(j j)
    {
        if (e.a())
        {
            a(a.e());
        }
        return super.a(j);
    }

    public final String c()
    {
        Object obj = Locale.getDefault().toString().replace('_', '-');
        obj = e.f().buildUpon().appendEncodedPath(e.e()).appendEncodedPath(a.a()).appendQueryParameter("key", f).appendQueryParameter("firstPartyProperty", "youTube").appendQueryParameter("language", ((String) (obj)));
        java.util.Map.Entry entry;
        for (Iterator iterator = a.b().entrySet().iterator(); iterator.hasNext(); ((android.net.Uri.Builder) (obj)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        String s = b.c();
        if (s != null)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("onBehalfOf", s);
        }
        return ((android.net.Uri.Builder) (obj)).build().toString();
    }

    public final Map h()
    {
        HashMap hashmap = new HashMap();
        c.a(hashmap, c(), l());
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((e)iterator.next()).a(hashmap)) { }
        return hashmap;
    }
}

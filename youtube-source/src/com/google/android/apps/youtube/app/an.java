// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.legacy.model.be;
import com.google.android.youtube.p;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ao, ap

public final class an
    implements af
{

    private static final be a;
    private static final be b;
    private static final be c;
    private static final be d;
    private static final be e;
    private final l f;
    private final GDataRequestFactory g;
    private final af h;
    private final af i;
    private final af j;
    private final String k;
    private final ConcurrentHashMap l = new ConcurrentHashMap();
    private final Pattern m = Pattern.compile("users/([^/]*)");

    public an(bc bc1, l l1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        f = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        g = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(bc1.a());
        h = (af)com.google.android.apps.youtube.common.fromguava.c.a(bc1.k());
        i = (af)com.google.android.apps.youtube.common.fromguava.c.a(bc1.s());
        j = (af)com.google.android.apps.youtube.common.fromguava.c.a(bc1.t());
        k = s;
    }

    static String a(an an1, GDataRequest gdatarequest)
    {
        an1 = an1.m.matcher(gdatarequest.a.getPath());
        if (an1.find())
        {
            return an1.group(1);
        } else
        {
            return null;
        }
    }

    static ConcurrentHashMap a(an an1)
    {
        return an1.l;
    }

    static void a(an an1, GDataRequest gdatarequest, b b1)
    {
        an1.a(gdatarequest, b1);
    }

    private void a(GDataRequest gdatarequest, b b1)
    {
        HashMap hashmap = new HashMap();
        GDataRequest gdatarequest1 = g.q();
        hashmap.put(gdatarequest1, a);
        GDataRequest gdatarequest2 = g.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, null, k, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK);
        hashmap.put(gdatarequest2, b);
        GDataRequest gdatarequest3 = g.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_DISCUSSED, null, k, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK);
        hashmap.put(gdatarequest3, c);
        gdatarequest = new ao(this, b1, gdatarequest, hashmap, 0x7fffffff);
        j.a(gdatarequest1, gdatarequest);
        h.a(gdatarequest2, gdatarequest);
        h.a(gdatarequest3, gdatarequest);
    }

    static be b()
    {
        return d;
    }

    public final ConcurrentHashMap a()
    {
        return l;
    }

    public final void a(Object obj, b b1)
    {
        GDataRequest gdatarequest2 = (GDataRequest)obj;
        if (!f.b())
        {
            HashMap hashmap = new HashMap();
            obj = g.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.RECENTLY_FEATURED, null, k, null);
            hashmap.put(obj, e);
            GDataRequest gdatarequest = g.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_POPULAR, null, k, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK);
            hashmap.put(gdatarequest, b);
            GDataRequest gdatarequest1 = g.a(com.google.android.apps.youtube.core.async.GDataRequestFactory.StandardFeed.MOST_DISCUSSED, null, k, com.google.android.apps.youtube.core.async.GDataRequestFactory.TimeFilter.THIS_WEEK);
            hashmap.put(gdatarequest1, c);
            b1 = new ao(this, b1, gdatarequest2, hashmap, 1);
            h.a(obj, b1);
            h.a(gdatarequest, b1);
            h.a(gdatarequest1, b1);
            return;
        }
        if (!gdatarequest2.a.toString().startsWith("/myfeed/users/"))
        {
            i.a(gdatarequest2, new ap(this, b1));
            return;
        } else
        {
            a(gdatarequest2, b1);
            return;
        }
    }

    static 
    {
        a = new be(p.cb);
        b = new be(p.ca);
        c = new be(p.bZ);
        d = new be(p.cc);
        e = new be(p.bY);
    }
}

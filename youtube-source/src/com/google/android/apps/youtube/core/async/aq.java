// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, GDataRequestFactory, GDataRequest, Timestamped, 
//            ar

public final class aq
    implements af
{

    private final a a;
    private final af b;
    private final GDataRequestFactory c;
    private final b d;
    private final long e;

    public aq(a a1, af af1, GDataRequestFactory gdatarequestfactory, b b1, long l)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        c = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = l;
    }

    private GDataRequest a(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<?xml version='1.0' encoding='UTF-8'?>");
        stringbuilder.append("<feed xmlns='http://www.w3.org/2005/Atom' xmlns:batch='http://schemas.google.com/gdata/batch' xmlns:yt='http://gdata.youtube.com/schemas/2007'>");
        stringbuilder.append("<batch:operation type='query'/>");
        Uri uri = c.b();
        for (list = list.iterator(); list.hasNext(); stringbuilder.append("</entry>"))
        {
            String s = (String)list.next();
            stringbuilder.append("<entry>");
            stringbuilder.append((new StringBuilder("<id>")).append(uri.buildUpon().appendPath(s).toString()).append("</id>").toString());
        }

        stringbuilder.append("</feed>");
        return com.google.android.apps.youtube.core.async.GDataRequest.a(c.c(), m.a(stringbuilder.toString()));
    }

    static GDataRequestFactory a(aq aq1)
    {
        return aq1.c;
    }

    static List a(aq aq1, List list, Map map, Map map1)
    {
        return a(list, map, map1);
    }

    private static List a(List list, Map map, Map map1)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            String s = (String)list.next();
            if (map.containsKey(s))
            {
                arraylist.add((new com.google.android.apps.youtube.datalib.legacy.model.BatchEntry.Builder()).setResult(map.get(s)).setStatusCode(200).build());
            } else
            {
                arraylist.add(map1.get(s));
            }
        }

        return arraylist;
    }

    static b b(aq aq1)
    {
        return aq1.d;
    }

    static a c(aq aq1)
    {
        return aq1.a;
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        obj = (List)obj;
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj1 = c.a(s);
            obj1 = (Timestamped)a.a(obj1);
            long l = d.a();
            if (obj1 != null && l >= ((Timestamped) (obj1)).timestamp && ((Timestamped) (obj1)).timestamp + e >= l)
            {
                hashmap.put(s, ((Timestamped) (obj1)).element);
            } else
            {
                arraylist.add(s);
            }
        }

        if (arraylist.isEmpty())
        {
            b1.a(obj, a(((List) (obj)), ((Map) (hashmap)), Collections.emptyMap()));
            return;
        } else
        {
            b.a(a(((List) (arraylist))), new ar(this, ((List) (obj)), b1, hashmap, arraylist, (byte)0));
            return;
        }
    }
}

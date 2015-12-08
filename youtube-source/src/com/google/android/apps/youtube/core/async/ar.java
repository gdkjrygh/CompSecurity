// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.datalib.legacy.model.BatchEntry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            aq, GDataRequestFactory, Timestamped

final class ar
    implements b
{

    final aq a;
    private final List b;
    private final b c;
    private final Map d;
    private final List e;

    private ar(aq aq1, List list, b b1, Map map, List list1)
    {
        a = aq1;
        super();
        b = list;
        c = b1;
        d = map;
        e = list1;
    }

    ar(aq aq1, List list, b b1, Map map, List list1, byte byte0)
    {
        this(aq1, list, b1, map, list1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        c.a(b, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        obj1 = new HashMap();
        Iterator iterator = e.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            String s = (String)iterator.next();
            BatchEntry batchentry = (BatchEntry)((List) (obj)).get(i);
            if (batchentry.b == 200)
            {
                aq.c(a).a(com.google.android.apps.youtube.core.async.aq.a(a).a(s), new Timestamped(batchentry.a, com.google.android.apps.youtube.core.async.aq.b(a).a()));
            }
            ((Map) (obj1)).put(s, batchentry);
        }

        c.a(b, com.google.android.apps.youtube.core.async.aq.a(a, b, d, ((Map) (obj1))));
    }
}

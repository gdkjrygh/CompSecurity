// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, GDataRequestFactory, GDataRequest, Timestamped, 
//            at

public final class as
    implements af
{

    private final af a;
    private final a b;
    private final GDataRequestFactory c;
    private final b d;

    public as(af af1, a a1, GDataRequestFactory gdatarequestfactory, b b1)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    static void a(as as1, GDataRequest gdatarequest, Set set)
    {
        if (!set.isEmpty())
        {
            gdatarequest = (String)gdatarequest.a.getPathSegments().get(3);
            gdatarequest = as1.c.b(gdatarequest);
            set = new ArrayList(set);
            as1.b.a(gdatarequest, new Timestamped(set, as1.d.a()));
        }
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        obj = (GDataRequest)obj;
        b1 = new at(this, b1);
        a.a(obj, b1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.m;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.Timestamped;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            v

final class ac
    implements m
{

    final v a;

    private ac(v v1)
    {
        a = v1;
        super();
    }

    ac(v v1, byte byte0)
    {
        this(v1);
    }

    public final void a(Object obj, Object obj1, a a1)
    {
        obj = (Timestamped)obj1;
        LiveEvent liveevent;
        for (obj1 = ((Page)((Timestamped) (obj)).element).iterator(); ((Iterator) (obj1)).hasNext(); a1.a(GDataRequestFactory.c(liveevent.selfUri), new Timestamped(liveevent, ((Timestamped) (obj)).timestamp)))
        {
            liveevent = (LiveEvent)((Iterator) (obj1)).next();
            com.google.android.apps.youtube.core.client.v.a(a);
        }

    }
}

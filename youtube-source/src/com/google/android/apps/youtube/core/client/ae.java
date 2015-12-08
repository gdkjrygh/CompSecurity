// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.m;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.Timestamped;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            v

final class ae
    implements m
{

    final v a;

    private ae(v v1)
    {
        a = v1;
        super();
    }

    ae(v v1, byte byte0)
    {
        this(v1);
    }

    public final void a(Object obj, Object obj1, a a1)
    {
        obj = (Timestamped)obj1;
        obj1 = ((Page)((Timestamped) (obj)).element).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Subscription subscription = (Subscription)((Iterator) (obj1)).next();
            if (subscription.type == com.google.android.apps.youtube.datalib.legacy.model.Subscription.Type.CHANNEL)
            {
                a1.a(com.google.android.apps.youtube.core.client.v.a(a).h(subscription.title), new Timestamped(subscription, ((Timestamped) (obj)).timestamp));
            }
        } while (true);
    }
}

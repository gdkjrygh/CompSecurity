// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.m;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.Timestamped;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            v

final class ad
    implements m
{

    final v a;

    private ad(v v1)
    {
        a = v1;
        super();
    }

    ad(v v1, byte byte0)
    {
        this(v1);
    }

    public final void a(Object obj, Object obj1, a a1)
    {
        obj = (Timestamped)obj1;
        obj1 = ((LiveEvent)((Timestamped) (obj)).element).video;
        a1.a(com.google.android.apps.youtube.core.client.v.a(a).a(((Video) (obj1)).id), new Timestamped(obj1, ((Timestamped) (obj)).timestamp));
    }
}

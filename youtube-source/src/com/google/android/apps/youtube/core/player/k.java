// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.AdPair;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            Director

final class k
    implements b
{

    final Director a;

    k(Director director)
    {
        a = director;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (String)obj;
        L.a((new StringBuilder("Error loading ad [request=")).append(((String) (obj))).append("]").toString(), exception);
        Director.a(a);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (AdPair)obj1;
        Director.a(a, ((AdPair) (obj)));
    }
}

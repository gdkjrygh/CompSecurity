// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.api:
//            s

final class w
    implements b
{

    final s a;

    private w(s s1)
    {
        a = s1;
        super();
    }

    w(s s1, byte byte0)
    {
        this(s1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error loading DefaultThumbnailLoader", exception);
        s.a(a);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        s.a(a, ((Video) (obj)));
    }
}

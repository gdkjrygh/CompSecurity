// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api:
//            s, t

final class v
    implements b
{

    final s a;
    private final String b;

    public v(s s1, String s2)
    {
        a = s1;
        super();
        b = c.a(s2, "videoId cannot be null or empty");
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error loading DefaultThumbnailLoader", exception);
        s.a(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        s.f(a).a(((Bitmap) (obj)), b, a.e(), a.d());
    }
}

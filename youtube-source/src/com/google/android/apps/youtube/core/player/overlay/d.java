// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            c, a

final class d
    implements b
{

    final c a;

    private d(c c1)
    {
        a = c1;
        super();
    }

    d(c c1, byte byte0)
    {
        this(c1);
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        L.a((new StringBuilder("Couldn't retrieve thumbnail from [uri=")).append(obj).append("]").toString(), exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        com.google.android.apps.youtube.core.player.overlay.c.b(a).setChannel(((Bitmap) (obj)));
    }
}

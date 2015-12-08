// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bs, br

final class bt
    implements b
{

    final bs a;

    bt(bs bs1)
    {
        a = bs1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        L.b("Failed to load playerview thumbnail", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        bs.a(a, ((Bitmap) (obj)));
        com.google.android.apps.youtube.core.player.overlay.bs.b(a).setThumbnail(bs.a(a));
    }
}

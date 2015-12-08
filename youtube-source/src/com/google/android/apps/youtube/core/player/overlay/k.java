// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            m, i, g

final class k extends m
{

    final i a;

    private k(i j)
    {
        a = j;
        super(j, (byte)0);
    }

    k(i j, byte byte0)
    {
        this(j);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj1 = (Bitmap)obj1;
        L.e((new StringBuilder("Got FeaturedChannel image from [uri=")).append(obj).append("]").toString());
        i.a(a).setFeaturedChannelImage(((Bitmap) (obj1)));
    }
}

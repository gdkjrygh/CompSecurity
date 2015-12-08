// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            m, i, g

final class j extends m
{

    final i a;

    private j(i k)
    {
        a = k;
        super(k, (byte)0);
    }

    j(i k, byte byte0)
    {
        this(k);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Uri)obj;
        obj1 = (Bitmap)obj1;
        L.e((new StringBuilder("Got CallToAction image from [uri=")).append(obj).append("]").toString());
        i.a(a).setCallToActionImage(((Bitmap) (obj1)));
    }
}

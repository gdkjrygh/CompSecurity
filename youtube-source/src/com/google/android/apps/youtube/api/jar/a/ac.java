// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            v

final class ac
    implements Runnable
{

    final Bitmap a;
    final v b;

    ac(v v1, Bitmap bitmap)
    {
        b = v1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        v.b(b).setChannel(a);
    }
}

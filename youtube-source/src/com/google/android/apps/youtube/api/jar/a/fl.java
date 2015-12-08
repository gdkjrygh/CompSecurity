// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.core.player.overlay.br;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            fh

final class fl
    implements Runnable
{

    final Bitmap a;
    final fh b;

    fl(fh fh1, Bitmap bitmap)
    {
        b = fh1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        fh.a(b).setThumbnail(a);
    }
}

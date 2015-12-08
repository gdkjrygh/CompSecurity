// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.TextureView;
import com.google.android.apps.youtube.api.b.a.bd;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ex, ev, ey

final class ew
    implements Runnable
{

    final bd a;
    final ev b;

    ew(ev ev1, bd bd)
    {
        b = ev1;
        a = bd;
        super();
    }

    public final void run()
    {
        ev.a(b, new ex(a, ev.a(b)));
        TextureView textureview = new TextureView(ev.b(b));
        textureview.setSurfaceTextureListener(ev.c(b));
        ev.a(b).a(textureview);
    }
}

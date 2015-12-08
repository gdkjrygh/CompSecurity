// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.bg;
import com.google.android.apps.youtube.core.player.overlay.bm;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            fg, ez

final class fa
    implements Runnable
{

    final bg a;
    final ez b;

    fa(ez ez1, bg bg)
    {
        b = ez1;
        a = bg;
        super();
    }

    public final void run()
    {
        ez.a(b, new fg(a));
        ez.b(b).setListener(ez.a(b));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import com.google.android.apps.youtube.core.player.overlay.b;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bk

final class bo
    implements Runnable
{

    final bk a;

    bo(bk bk1)
    {
        a = bk1;
        super();
    }

    public final void run()
    {
        bk.a(a).d();
    }
}

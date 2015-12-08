// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            v

final class aa
    implements Runnable
{

    final boolean a;
    final v b;

    aa(v v1, boolean flag)
    {
        b = v1;
        a = flag;
        super();
    }

    public final void run()
    {
        v.b(b).setFullscreen(a);
    }
}

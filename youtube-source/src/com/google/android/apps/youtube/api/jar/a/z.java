// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.a;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            v

final class z
    implements Runnable
{

    final String a;
    final v b;

    z(v v1, String s)
    {
        b = v1;
        a = s;
        super();
    }

    public final void run()
    {
        v.b(b).setAdTitle(a);
    }
}

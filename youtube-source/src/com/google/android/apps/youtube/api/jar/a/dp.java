// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.au;
import com.google.android.apps.youtube.core.player.overlay.ak;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ds, do

final class dp
    implements Runnable
{

    final au a;
    final do b;

    dp(do do1, au au)
    {
        b = do1;
        a = au;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.api.jar.a.do.a(b, new ds(a));
        com.google.android.apps.youtube.api.jar.a.do.b(b).setListener(com.google.android.apps.youtube.api.jar.a.do.a(b));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.am;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dy

final class ea
    implements Runnable
{

    final boolean a;
    final dy b;

    ea(dy dy1, boolean flag)
    {
        b = dy1;
        a = flag;
        super();
    }

    public final void run()
    {
        dy.b(b).setKeepScreenOn(a);
    }
}

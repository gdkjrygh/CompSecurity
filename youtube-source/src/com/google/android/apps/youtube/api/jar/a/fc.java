// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.bm;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ez

final class fc
    implements Runnable
{

    final boolean a;
    final ez b;

    fc(ez ez1, boolean flag)
    {
        b = ez1;
        a = flag;
        super();
    }

    public final void run()
    {
        ez.b(b).setVisible(a);
    }
}

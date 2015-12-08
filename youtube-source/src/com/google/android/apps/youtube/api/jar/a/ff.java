// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.bm;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ez

final class ff
    implements Runnable
{

    final ez a;

    ff(ez ez1)
    {
        a = ez1;
        super();
    }

    public final void run()
    {
        ez.b(a).d();
    }
}

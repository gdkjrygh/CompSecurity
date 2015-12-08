// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.ai;
import com.google.android.apps.youtube.core.player.overlay.g;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ay, ae

final class af
    implements Runnable
{

    final ai a;
    final ae b;

    af(ae ae1, ai ai)
    {
        b = ae1;
        a = ai;
        super();
    }

    public final void run()
    {
        ae.a(b, new ay(a));
        ae.b(b).setListener(ae.a(b));
    }
}

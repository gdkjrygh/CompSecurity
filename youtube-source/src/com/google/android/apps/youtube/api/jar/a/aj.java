// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.g;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ae

final class aj
    implements Runnable
{

    final boolean a;
    final ae b;

    aj(ae ae1, boolean flag)
    {
        b = ae1;
        a = flag;
        super();
    }

    public final void run()
    {
        ae.b(b).a(a);
    }
}

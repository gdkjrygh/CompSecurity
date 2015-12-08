// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.SurfaceHolder;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ej

final class ep
    implements Runnable
{

    final int a;
    final ej b;

    ep(ej ej1, int i)
    {
        b = ej1;
        a = i;
        super();
    }

    public final void run()
    {
        if (ej.d(b) != null)
        {
            ej.d(b).setFormat(a);
        }
    }
}
